<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'change.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<!-- <link rel="stylesheet" type="text/css" href="css/change.css"> -->
	

  </head>
  
  <body>
      <form action="Student_change" method="post">
        姓名：<input type="text" name="studentName" value="${stu.studentName }"><br><br>
        <input type="hidden" name="studentId" value="${stu.studentId }">
        <input type="hidden" name="classId" value="${stu.crmclass.classId }">
        现在所在班级：<input type="text" name="courseName" value="${stu.crmclass.crmcoursetype.courseName }"><input type="text" name="className" value="${stu.crmclass.className }"><br><br>
        操作类型：<select name="flag">
                 <option>升级</option>
                 <option>转班</option>
              </select><br><br>
        操作学科：<select name="courseName">
                 <option>Java就业</option>
                 <option>前端开发</option>
              </select>
        操作班级：<select name="afterClassId">
                 <option value="1">1期ee</option>
                 <option value="2">2期ee</option>
              </select><br><br> 
              <input type="submit" value="保存">     
      </form>
  </body>
</html>
