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
  <form action="Student_regist">
  姓名：<input type="text" name="studentName"> 性别：<input type="radio" name="gender" value="男">男<input type="radio" name="gender" value="女">女<br><br>
   应付学费：<input type="text" name="mustTuition">  实付学费：<input type="text" name="actualTuition"><br><br>
   身份证号：<input type="text" name="identity"> 手机号码：<input type="text" name="telephone"><br><br>
   QQ号：<input type="text" name="qq">  邮箱：<input type="text" name="email"><br><br>
   就读班级：类别：<select><option></option><option></option><option></option></select> 
                   班级：<select><option></option><option></option><option></option></select><br><br>
   毕业学校：<input type="text" name="school"> 学历：<select name="education"><option>--选择学历--</option><option>--本科--</option><option>--大专--</option></select>
   专业：<input type="text" name="professional"> <br><br>
   身份证地址：<input type="text" name="identityAddress"><br><br>  
   在京地址：<input type="text" name="address"><br><br> 
   学院描述：<input type="text" name="remark"><br><br> 
   家庭联系电话：<input type="text" name="homeTelephone"> 家庭联系人：<input type="text" name="homeContact"><br><br>
   <input type="text" name="referId">   <input type="text" name="classId">         
   <input type="submit" value="注册">
   </form>
   </center>
  </body>
</html>
