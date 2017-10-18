<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link type="text/css" rel="stylesheet" href="../css/style.css">
  </head>
 <body>
  <center>
  <img src="imgs/zhu.png"><br><br>
  <div style="background-color: pink; width: 300px;position: relative;left: 300px;bottom: 350px">
     <br>
     <h3>欢迎使用CRM系统</h3>
        <form action="Staff_login" method="post">
                    用户名：<input type="text" name="loginName"><br><br>
                    密&emsp;码：<input type="text" name="loginPwd"><br><br>
              <input type="submit" value="登录" style="background-color: white;color: red">
              <input type="reset" value="重置" style="background-color: white;color: red">
        </form>
    </div>
    </center>
  </body>
  
</html>
