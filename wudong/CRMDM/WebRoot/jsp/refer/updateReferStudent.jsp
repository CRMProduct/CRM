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
	
	<link rel="stylesheet" type="text/css" href="css/updateReferStudent.css">
	

  </head>
  <body>
  <div><h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 10px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;[查&nbsp;看&nbsp;咨&nbsp;询&nbsp;学&nbsp;生]</h3></div><br> 
  <div style="position: relative; top:1%; background: #ABD1E7;height: 70%"><br>
  <form action="Refer_updateReferStudent" method="post">
  <center>
 姓&emsp;&emsp;名：<input type="text" name="studentName" value="${refer.studentName }" class="input"><br><br>
 电&emsp;&emsp;话：<input type="text" name="telephone" value="${refer.telephone }" class="input"><br><br>
 Q&nbsp;&nbsp;&nbsp;Q&emsp;&emsp;：<input type="text" name="qq" value="${refer.qq }" class="input"><br><br>
 意向级别：
 <%-- <input type="text" name="intentionLevel" value="${refer.intentionLevel }" class="input"> --%>
 <select name="intentionLevel" class="input">
        <option value="${refer.intentionLevel }" >${refer.intentionLevel }</option>
        <option value="想报名，考虑中">想报名，考虑中</option>
        <option value="不想报名">不想报名</option>
        </select>       
 
 <br><br>
 意向学科：
 <%-- <input type="text" name="courseTypeId" value="${refer.courseTypeId }" class="input"> --%>
 <select name="courseTypeId" class="input">
        <option value="${refer.courseTypeId }" >${refer.courseTypeId }</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        </select>  
 <br><br>
 意向班级：
<%--  <input type="text" name="classId" value="${refer.classId }" class="input"> --%>
 <select name="classId" class="input">
        <option value="${refer.classId }" >${refer.classId }</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        </select>  
 <br><br>
 来&emsp;&emsp;源：
 <%-- <input type="text" name="source" value="${refer.source }" class="input"> --%>
 <select name="source" class="input">
        <option value="${refer.source }" >${refer.source }</option>
        <option value="电话咨询">"电话咨询"</option>
        <option value="微信咨询">微信咨询</option>
        <option value="qq咨询">qq咨询</option>
        </select>  
 
 <br><br>
 备&emsp;&emsp;注&nbsp;&nbsp;：<input type="text" name="remark" value="${refer.remark }" class="input"><br><br>
  <input type="hidden" name="referId" value="${refer.referId }"> 
 <input type="hidden" name="createDate" value="${refer.createDate }"> 
 <input type="hidden" name="studentStatus" value="${refer.studentStatus }"> 
 <input type="hidden" name="staffId" value="${refer.staffId }"> 
  
  <input type="submit" value="提交" style="background-color: orange;color: white">
  &emsp;
  <input type="button" value="返回" onclick="javaScript:history.go(-1)">
  </center>
  </form>
  </div>
  </body>
  
</html>
