<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <body>
  
  <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;部&nbsp;门&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; bottom: 16px;left: 800px">
 <a href="jsp/regist.jsp"><input type="button" value="添加"></a></div>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
  <form action="Student_update">
  姓名：<input type="text" name="studentName" value="${stu.studentName }"> 性别：<input type="radio" name="gender">男<input type="radio" name="gender">女<br><br>
   应付学费：<input type="text" name="mustTuition" value="${stu.mustTuition }">  实付学费：<input type="text" name="actualTuition" value="${stu.actualTuition }"><br><br>
   身份证号：<input type="text" name="identity" value="${stu.identity }"> 手机号码：<input type="text" name="telephone" value="${stu.telephone }"><br><br>
   QQ号：<input type="text" name="qq" value="${stu.qq }">  邮箱：<input type="text" name="email" value="${stu.email }"><br><br>
   就读班级：类别：<select><option></option><option></option><option></option></select> 
                   班级：<select><option></option><option></option><option></option></select><br><br>
   毕业学校：<input type="text" name="school" value="${stu.school }"> 学历：<select name="education"><option>--选择学历--</option><option>--本科--</option><option>--大专--</option></select>
   专业：<input type="text" name="professional" value="${stu.professional }"> <br><br>
   身份证地址：<input type="text" name="identityAddress" value="${stu.identityAddress }"><br><br>  
   在京地址：<input type="text" name="address" value="${stu.address }"><br><br> 
   学院描述：<input type="text" name="remark" value="${stu.remark }"><br><br> 
   家庭联系电话：<input type="text" name="homeTelephone" value="${stu.homeTelephone }" > 家庭联系人：<input type="text" name="homeContact" value="${stu.homeContact }"><br><br>
   <input type="text" name="referId" value="${stu.crmrefer.referId }">   <input type="text" name="classId" value="${stu.crmclass.classId }">         
    <input type="text" name="studentId" value="${stu.studentId }">  <input type="text" name="pageCode" value="${pageCode }"> 
   <input type="submit" value="更新">
   </form>
   </center>
  </body>
</html>
