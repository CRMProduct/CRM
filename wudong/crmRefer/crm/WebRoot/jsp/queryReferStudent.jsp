<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	
	<link rel="stylesheet" type="text/css" href="css/queryReferStudent.css">
	

  </head>
  <body>
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 10px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[查&nbsp;看&nbsp;咨&nbsp;询&nbsp;学&nbsp;生]</h3></div><br> 
  <div style="position: relative; top:1%; background: #ABD1E7;height: 70%"><br>
  
  <center>
 姓&emsp;&emsp;名：<input type="text" name="studentName" value="${refer.studentName }" class="input"><br><br>
 电&emsp;&emsp;话：<input type="text" name="telephone" value="${refer.telephone }" class="input"><br><br>
 Q&nbsp;&nbsp;Q&emsp;&emsp;：<input type="text" name="qq" value="${refer.qq }" class="input"><br><br>
 咨询人&emsp;：<input type="text" name="staffId" value="${refer.staffId }" class="input"><br><br>
 意向级别：<input type="text" name="intentionLevel" value="${refer.intentionLevel }" class="input"><br><br>
 意向学科：<input type="text" name="courseTypeId" value="${refer.courseTypeId }" class="input"><br><br>
 来&emsp;&emsp;源：<input type="text" name="source" value="${refer.source }" class="input"><br><br>
 备&emsp;&emsp;注：<input type="text" name="remark" value="${refer.remark }" class="input"><br><br>
 跟踪信息：<a href="jsp/addFollow.jsp" class="input">添加跟踪</a><br><br>
  </center>
  
  </div>
  </body>
  
</html>
