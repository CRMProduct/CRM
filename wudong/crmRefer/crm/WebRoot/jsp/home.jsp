<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<link rel="stylesheet" type="text/css" href="css/home.css">
	

  </head>
 
  <body>
   <div style=" height: 80px; background: #09F">
  <div style=" font-size: 12px; color: white;height: 15px;width: 200px;position:relative;left: 700px;top: 5px" align="right">今天是${requestScope.time}</div>
  <table align="right" style="position: relative;top: 40px;width: 300px">
  <tr style="font-size: 12px; color: white">
  <td>欢迎您，管理员EL表达式</td>
  <td><a href="jsp/login.jsp" style="text-decoration: none; color: white">更改口令</a></td>
  <td><a href="jsp/login.jsp" style="text-decoration: none; color: white">重新登录</a></td>
  </tr>
  </table>
  </div>
  <img src="imgs/1.png" width="90%" height="500px" style=" position: relative;left: 195px">
  <div style=" width: 195px; height:500px;background: #ABD1E7;position: relative;bottom: 504px">
  <table>
  <tr style=" font-size:14px"><td>系统控制面板</td></tr>
  <tr style=" font-size:14px;color:#666"><td>CRM管理系统</td></tr>
  <tr><td>
   <font style=" font-size:14px">咨询部</font><br>
  <a href="Refer_queryRefer" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">咨询学生管理</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">查询报名学生</font></a><br>
  </td></tr>
  <tr><td>
  <font style=" font-size:14px">学工部</font><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">在校学生管理</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">学生升级/留班</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">学生流失情况</font></a><br>
  </td></tr>
  <tr><td>
   <font style="font-size:14px">教学部</font><br>
  <a href="Class_queryClass" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">班级管理</font></a><br>
  <a href="Course_queryCourse" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">课程类别</font></a><br>
  </td></tr>
  <tr><td>
   <font style=" font-size:14px">就业部</font><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">就业情况</font></a><br>
  </td></tr>
  <tr><td>
  <font style=" font-size:14px">人力资源部</font><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">部门管理</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">职务管理</font></a><br>
  <a href="" style="text-decoration: none;">&nbsp;&nbsp;&nbsp;&nbsp;<font style=" font-size: 12px">员工管理</font></a><br>
  </td></tr>
  
  </table>
  </div>
  </body>
</html>
