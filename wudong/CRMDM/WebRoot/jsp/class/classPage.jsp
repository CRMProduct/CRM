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
    
    <title>My JSP 'classPage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/classPage.css">
	

  </head>
  
  <body>
    <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;班&nbsp;级&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; bottom: 16px;left: 800px">
 <a href="jsp/class/addClass.jsp" style=" text-decoration: none; position: relative;top:20px">添加班级</a></div>
 <br>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4><br>
   <table width="85%" border="1px" bordercolor="#999999;">
    <tr height="30px"><th width="10%">班级名称</th><th width="10%">所属课程</th><th width="10%">开班时间</th><th width="10%">毕业时间</th><th width="8%">状态</th><th width="10%">学生总数</th><th width="9%">升学数</th><th width="9%">转班数</th>
    <th width="8%">编辑</th><th width="8%">查看</th><th width="10%">课表</th>
    </tr>
    <c:forEach var="class1" items="${ pageBean.list }">
    <tr align="center">
    <c:if test="pageBean.list!= null"></c:if>
     <td>${ class1.className}</td>
     <td>${ class1.crmcoursetype.courseName}</td>
     <td>${ class1.beginTime}</td>
     <td>${ class1.endTime}</td>
     <td>${ class1.status}</td>
     <td>${ class1.totalCount}</td>
     <td>${ class1.upgradeCount}</td>
     <td>${ class1.changeCount}</td>
     <td><a href="Class_findClass?classId=${ class1.classId}&pageCpde=${ pageBean.pageCode}" style="text-decoration: none;"><img src="imgs/bianji.png" border="none"/></a></td>
     <td><a href="Student_find?studentId=${ student.studentId}&pageCpde=${ pageBean.pageCode}"style="text-decoration: none;"><img src="imgs/chakan.png" border="none"/></a></td>
     <td>${ class1.uploadFileName}</td>
    </tr>
    
   </c:forEach>
    <tr>
     <td colspan="6" align="right">
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Class_queryClass?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Class_queryClass?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Class_queryClass?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Class_queryClass?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td colspan="2">
       <form action="Class_queryClass">
          <input type="text" name="pageCode" size="1">
          <input type="submit" value="go">
        </form>
     </td>
     <td  colspan="3">
              共${pageBean.allPages }页
     </td>
    </tr>
   </table>
   </center>
  </body>
</html>
