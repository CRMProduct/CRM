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
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;升级/转班&nbsp;管&nbsp;理</h3>
  </div>
   <div style="position: relative;left: 80%">
 <a href="jsp/home.jsp" style="text-decoration: none;">返回</a>
 </div><br>
  <center>
  <h4 align="left" style="position:relative;left: 100px;color: orange ">查询结果</h4>
   <br><table width="80%" border="1px" bordercolor="#999999;">
    <tr height="50px"><th>学生姓名</th><th>操作时间</th><th>操作类型</th><th>经办人</th><th>操作前的班级</th><th>操作后的班级</th></tr>
   <c:forEach var="station" items="${pageBean.list }">
    <tr align="center">
     <td>${station.crmstudent.studentName }</td>
     <td>${station.createDate }</td>
     <td>${station.flag }</td>
     <td>管理员</td>
     <td>${beforeClassName }</td>
     <td>${afterClassName }</td>
    </tr>
   </c:forEach>
    <tr>
     <td colspan="4" align="right">
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Station_query?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Station_query?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Station_query?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Station_query?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td>
       <form action="Station_query">
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
