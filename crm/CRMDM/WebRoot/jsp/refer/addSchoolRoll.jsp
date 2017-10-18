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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	 <link type="text/css" rel="stylesheet" href="css/addSchoolRoll.css">
  </head>
  
  <body style=" width: 100%;height: 100%">
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[录&nbsp;入&nbsp;学&nbsp;籍]</h3></div><br> 
  <div style="position: relative; top:5%; background: #ABD1E7;height: 60%"><br>
  <form action="" method="post">
  <center>
 姓&emsp;名：<input type="text" name="studentName" value="${refer.studentName }" class="input"><br><br>
 电&emsp;话：<input type="text" name="telephone" value="${refer.telephone }" class="input"><br><br>
 Q&nbsp;&nbsp;Q&emsp;：<input type="text" name="QQ" value="${refer.QQ }" class="input"><br><br>
 身份证：<input type="text" name="" value="" class="input"><br><br>
 
  <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
  </center>
  </form>
  </div>
  </body>
  
 </html>
