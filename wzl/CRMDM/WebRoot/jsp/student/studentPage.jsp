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
    
    <title>My JSP 'home.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <body>
  
  <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;部&nbsp;门&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; bottom: 16px;left: 800px">
 <a href="jsp/student/regist.jsp"><input type="button" value="添加"></a></div>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
   <table width="80%" border="1px" >
    <tr height="50px"><th>姓名</th><th>入学时间</th><th>班级</th><th>QQ</th><th>联系电话</th><th>应付/实付学费</th><th>状态</th><th>编辑</th><th>升级/转班</th><th>查看</th><th>流失</th></tr>
   <c:forEach var="stu" items="${pageBean.list }">
    <tr align="center">
     <td>${stu.studentName }</td>
     <td>${stu.crmclass.beginTime }</td>
     <td>${stu.crmclass.className }</td>
     <td>${stu.qq }</td>
     <td>${stu.telephone }</td>
     <td>${stu.mustTuition }/${stu.actualTuition }</td>
     <td>${stu.studentStatus }</td>
     <td><a href="Student_find?studentId=${stu.studentId }&pageCode=${pageBean.pageCode }">编辑</a></td>
     <td>升级/转班</td>
     <td>查看</td>
     <td>流失</td>
    </tr>
   </c:forEach>
    <tr>
     <td>
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Dept_query?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Dept_query?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Dept_query?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Dept_query?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td style="position: relative;top: 10px">
       <form action="Dept_query">
          <input type="text" name="pageCode" size="1">
          <input type="submit" value="go">
        </form>
     </td>
     <td>
              共${pageBean.allPages }页
     </td>
    </tr>
   </table>
   </center>
  </body>
</html>
