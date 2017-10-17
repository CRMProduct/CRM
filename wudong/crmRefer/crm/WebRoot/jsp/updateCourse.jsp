<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/updateCourse.css">
	

  </head>
  
  <body>
  
   <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[课&nbsp;程&nbsp;类&nbsp;别&nbsp;管&nbsp;理]</h3></div><br> 
 <center>
  <div style="position: relative; top:5%; background: #ABD1E7;height: 70%"><br>
    <form action="Course_updateCourse" method="post">
    课程类别：<input type="text" name="courseName"value="${course.courseName}" class="input"/><br><br>
    总学时&emsp;：<input type="text" name="total" value="${course.total}" class="input"/><br><br>  
    课程费用：<input type="text" name="courseCost"value="${course.courseCost}" class="input"/><br><br>
    课程简介：<input type="text" name="remark" value="${course.remark}"  style=" height: 100px;width: 250px"/>  
      <input type="hidden" name="courseTypeId" value="${course.courseTypeId}"><br><br>
    <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
    </form>
    </div>
    </center>
  </body>
</html>
