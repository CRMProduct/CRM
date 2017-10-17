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
    
    <title>My JSP 'coursePage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/coursePage.css">
	

  </head>
  
  <body>
  <div> 
  <h3 style="background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;课&nbsp;程&nbsp;类&nbsp;别</h3>
  </div>
 <div style="position: relative;left: 800px;top: 5px">
 <a href="jsp/addCourse.jsp" style="text-decoration: none;">添加</a></div>
 <center>
 <br>
 课程类别：<input type="text"name="courseName" class="input"><br><br>
 课程简介：<input type="text"name="remark"  class="input"><br><br>
 总学时&emsp;：<input type="text"name="total" class="input"><br><br>
 课程费用：<input type="text"name="courseCost" class="input"><br><br>
 </center>
 
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
   <table width="80%" border="1px" >
    <tr height="50px"><th width="25%">名称</th><th width="25%">简介</th><th width="25%">总学时</th><th width="20%">收费标准</th><th width="15%">编辑</th></tr>
   <c:forEach var="course" items="${pageBean.list }">
    <tr align="center">
     <td>${course.courseName}</td>
     <td>${course.remark}</td>
     <td>${course.total}</td>
     <td>${course.courseCost}</td>
     
     <td><a href="Course_findCourse?courseTypeId=${course.courseTypeId }&pageCode=${pageBean.pageCode }" style="text-decoration: none;">编辑</a></td>
    </tr>
   </c:forEach>
    
   <tr>
    <td colspan="2" align="left"> 
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Course_queryCourse?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Course_queryCourse?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Course_queryCourse?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Course_queryCourse?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td colspan="1">
       <form action="Course_queryCourse">
          <input type="text" name="pageCode" size="1">
          <input type="submit" value="go">
        </form>
     </td>
     <td colspan="2">
              共${pageBean.allPages }页
     </td>
    </tr>
  </table>
   </center>
  </body>
</html>
