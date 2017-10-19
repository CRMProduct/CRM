<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'runoff.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
    <form action="RunOff_add">
      姓名：<input type="text" name="studentName" value="${stu.studentName }"><br><br>
      <input type="hidden" name="studentId" value="${stu.studentId }">
      是否退款：<input type="radio" name="isRefund" value="是">是 <input type="radio" name="isRefund" value="否">否<br><br>
      退款金额：<input name="refundAmount" type="text"><br><br>
      <input type="submit" value="提交">
    </form>
  <body>
    
  </body>
</html>
