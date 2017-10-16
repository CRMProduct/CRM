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
    
    <title>My JSP 'updateClass.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/updateClass.css">
	

  </head>
  <body>
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[班&nbsp;级&nbsp;管&nbsp;理]</h3></div><br> 
  <div style="position: relative; top:5%; background: #ABD1E7;height: 70%"><br>
  <form action="Class_updateClass" method="post">
  <center>
 班级名称&emsp;：<input type="text" name="className" value="${crmclass.className }" class="input"><br><br>
 所属类别&emsp;：<select name="courseTypeId" class="input">
        <option >---请选择---</option>
        <c:forEach var="course" items="${course }">
        <option value="courseTypeId">${course.courseName }</option>
        </c:forEach>
        </select>       
 <br><br>
 开课时间&emsp;：<input type="text" name="beginTime" value="${crmclass.beginTime }" class="input"><br><br>
 结业时间&emsp;：<input type="text" name="endTime" value="${crmclass.endTime }" class="input"><br><br>
班级总人数：<input type="text" name="totalCount" value="${crmclass.totalCount }" class="input"><br><br>
其它说明&emsp;：<input type="text" name="remark" value="${crmclass.remark }" style=" height: 100px;width: 250px"><br><br>
<input type="text" name="classId" value="${crmclass.classId }"> 
<input type="text" name="status" value="${crmclass.status }">
 <input type="text" name="upgradeCount" value="${crmclass.upgradeCount }">
 <input type="text" name="changeCount" value="${crmclass.changeCount }">
 <input type="text" name="runoffCount" value="${crmclass.runoffCount }">  
 <input type="text" name="uploadPath" value="${crmclass.uploadPath }">   
 <input type="text" name="uploadFileName" value="${crmclass.uploadFileName }">
 <input type="text" name="uploadTime" value="${crmclass.uploadTime }">

  <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
  </center>
  </form>
  <br>
  </div>
  </body>
  
</html>
