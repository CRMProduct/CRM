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
	
	<link rel="stylesheet" type="text/css" href="css/queryClass.css">
	

  </head>
  <body>
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 10px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[查&nbsp;看&nbsp;班&nbsp;级]</h3></div><br> 
  <center>
  <div style="position: relative; top:1%; background: #ABD1E7;height: 70%"><br>
 班级名称：<input type="text" name="name" value="${crmclass.className }" class="input">
 所属类别：<input type="text" name="courseName" value="${crmclass.crmcoursetype.courseName }" class="input"><br><br>
 开课时间：<input type="text" name="beginTime" value="${crmclass.beginTime }" class="input">
 结业时间：<input type="text" name="endTime" value="${crmclass.endTime }" class="input"><br><br>
 学生总数：<input type="text" name="totalCount" value="${crmclass.totalCount }" class="input">
 升级数&emsp;：<input type="text" name="upgradeCount" value="${crmclass.upgradeCount }" class="input"><br><br>
 转班数&emsp;：<input type="text" name="changeCount" value="${crmclass.changeCount }" class="input">
 退费数&emsp;：<input type="text" name="runoffCount" value="${crmclass.runoffCount }" class="input"><br><br>
 其它说明：<input type="text" name="remark" value="${crmclass.remark }" style=" height: 70px;width:350px"><br><br>
 
 学生明细：<table width="40%">
  <tr>
    <td>状态</td><td>姓名</td><td>付费情况</td><td>QQ</td><td>联系电话</td>
  </tr>
  <c:forEach var="stu" items="${crmclass.crmstudents }">
  <tr>
    <td>${stu.studentStatus }</td>
    <td>${stu.studentName }</td>
    <td>${stu.actualTuition }/${stu.mustTuition }</td>
    <td>${stu.qq }</td>
    <td>${stu.telephone }</td>
  </tr>
  </c:forEach>
 </table>
  </div>
  </center>
  </body>
  
</html>
