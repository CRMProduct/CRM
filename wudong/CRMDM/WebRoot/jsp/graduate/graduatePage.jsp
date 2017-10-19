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
	
	<link rel="stylesheet" type="text/css" href="css/change.css">
	

  <body>
  
  <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;就&nbsp;业&nbsp;情&nbsp;况</h3>
  </div>
 <div style="position: relative;left: 80%">
 <a href="jsp/graduate/addGraduate.jsp" style="text-decoration: none;">添加</a>
 <a href="jsp/home.jsp" style="text-decoration: none;">返回</a>
 </div><br>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
   <br><table width="80%" border="1px" bordercolor="#999999;">
    <tr height="50px">
    	<th width="10%">学生姓名</th>
    	<th width="10%">就读班级</th>
    	<th width="10%">就业公司</th>
    	<th width="10%">薪资</th>
    	<th width="10%">岗位</th>
    	<th width="10%">入职时间</th>
    	<th width="10%">描述</th>
    	<th width="10%">编辑</th>
    </tr>
   <c:forEach var="graduate" items="${pageBean.list }">
    <tr align="center">
     <td>${graduate.crmclass.className }</td>
     <td>${graduate.crmstudent.studentName }</td>
     <td>${graduate.companyName }</td>
     <td>${graduate.salary}</td>
     <td>${graduate.post }</td>
     <td>${graduate.entryTime }</td>
     <td>${graduate.remark}</td>
     <td><img src="imgs/bianji.png" border="none"/></td>
    </tr>
   </c:forEach>
    <tr>
    	<td colspan="8" align="right">
    	第${pageBean.pageCode}/${pageBean.allPages}页
    	<a href="Post_query?pageCode=1">[首页]</a>
    	 <c:if test="${pageBean.pageCode>1 }">
    	<a href="Post_query?pageCode=${pageBean.pageCode-1}">[上一页]</a>
    	</c:if>
    	 <c:if test="${pageBean.pageCode < pageBean.allPages}">
    	<a href="Post_query?pageCode=${pageBean.pageCode+1}">[下一页]</a>
    	</c:if>
    	<a href="Post_query?pageCode=${pageBean.allPages}">[尾页]</a>
    	</td>
    </tr>
   </table>
   </center>
  </body>
</html>
