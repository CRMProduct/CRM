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
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[班&nbsp;级&nbsp;管&nbsp;理]</h3></div><br> 
  <div style="position: relative; top:5%; background: #ABD1E7;height: 60%"><br>
  <form action="Class_addClass" method="post">
  <center>
 班级名称&emsp;：<input type="text" name="className" class="input"><br><br>
 所属类别&emsp;：<select name="courseName" class="input">
        <option >---请选择---</option>
        <option value="人力资源部">人力资源部</option>
        <option value="咨询部">咨询部</option>
        <option value="教学部">教学部</option>
        <option value="学工部">学工部 </option>
        <option value="就业部">就业部</option>
        </select>
 <!-- <input type="text" name="courseName" class="input"> --><br><br>
 开课时间&emsp;：<input type="text" name="beginTime" class="input"><br><br>
 结业时间&emsp;：<input type="text" name="endTime" class="input"><br><br>
班级总人数：<input type="text" name="totalCount" class="input"><br><br>
其它说明&emsp;：<input type="text" name="remark" style=" height: 100px;width: 250px"><br><br>
  <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
  </center>
  </form><br>
  </div>
  </body>
  
 </html>
