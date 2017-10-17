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
	
	 <link type="text/css" rel="stylesheet" href="css/addClass.css">
  </head>
  
  <body style=" width: 100%;height: 100%">
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[添&nbsp;加&nbsp;跟&nbsp;踪]</h3></div><br> 
  <div style="position: relative; top:5%; background: #ABD1E7;height: 60%"><br>
  <form action="Class_addClass" method="post">
  
 <div style=" position: relative; left: 230px; top:20px">跟踪信息：</div>
 <center>
 <input type="text" name="remark" style=" height: 150px;width: 350px"><br><br>
  <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
  </center>
  </form><br>
  </div>
  </body>
  </html>
 