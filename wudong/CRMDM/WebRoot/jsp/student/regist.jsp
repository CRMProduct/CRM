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
	
	<link rel="stylesheet" type="text/css" href="css/regist.css">
	

  <body>
  
  <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;正&nbsp;式&nbsp;学&nbsp;员&nbsp;管&nbsp;理</h3>
  </div>
 <br><br>
  <center>
  <div style="background-color: #ABD1E7;">
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
  <form action="Student_regist">
  姓&emsp;&emsp;名&emsp;&emsp;：<input type="text" name="studentName" class="input"> <br>
  性&emsp;&emsp;别&emsp;&emsp;：&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;<input type="radio" name="gender" value="男">男
  &emsp;&emsp;&emsp;&emsp;&emsp;<input type="radio" name="gender" value="女"  >女<br>
   应付学费&emsp;&emsp;：<input type="text" name="mustTuition" class="input"> <br> 
   实付学费&emsp;&emsp;：<input type="text" name="actualTuition" class="input"><br>
   身份证号&emsp;&emsp;：<input type="text" name="identity" class="input"> <br>
   手机号码&emsp;&emsp;：<input type="text" name="telephone" class="input"><br>
   Q&emsp;&nbsp;&nbsp;Q&emsp;号&emsp;：<input type="text" name="qq" class="input"> <br> 
   邮&emsp;&emsp;箱&emsp;&emsp;：<input type="text" name="email" class="input"><br>
   就读班级&emsp;&emsp;：类别：<select style="width: 75px"><option></option><option></option><option></option></select> 
                   班级：<select style="width: 75px"><option></option><option></option><option></option></select><br>
   毕业学校&emsp;&emsp;：<input type="text" name="school"  class="input"> <br>
   学&emsp;&emsp;历&emsp;&emsp;：<select name="education" style="width: 100px"><option>--选择学历--</option><option>--本科--</option><option>--大专--</option></select>
   专业：<input type="text" name="professional" style="width: 100px"> <br>
   身份证地址&emsp;：<input type="text" name="identityAddress" class="input"><br> 
   在京地址&emsp;&emsp;：<input type="text" name="address" class="input"><br>
   学院描述&emsp;&emsp;：<input type="text" name="remark" class="input"><br>
   家庭联系电话：<input type="text" name="homeTelephone" class="input"> <br>
   家庭联系人&emsp;：<input type="text" name="homeContact" class="input"><br>
   <input type="hidden" name="referId">   <input type="hidden" name="classId">         
   <input type="submit" value="注册">
   </form>
   </div>
   </center>
  </body>
</html>
