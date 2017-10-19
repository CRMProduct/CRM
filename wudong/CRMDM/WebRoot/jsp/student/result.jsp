<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'result.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <center>
    <table>
      <tr><td>姓名：</td><td>${stu.studentName }</td></tr>
      <tr><td>状态：</td><td>${stu.studentStatus }</td></tr>
      <tr><td>类别：</td><td>${stu.crmclass.crmcoursetype.courseName }</td></tr>
      <tr><td>班级：</td><td>${stu.crmclass.className }</td></tr>
    </table>
  </center>
     
  </body>
</html>
