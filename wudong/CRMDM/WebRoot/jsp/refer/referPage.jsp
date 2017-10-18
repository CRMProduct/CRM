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
	
	<link rel="stylesheet" type="text/css" href="css/referPage.css">
	

  </head>
  
  <body>
    <div>
  <h3 style=" background-color: #93C9FF; color: white;height: 30px;width: 80%px;position: relative;top: 30px"> 
  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
  咨&nbsp;询&nbsp;学&nbsp;生&nbsp;管&nbsp;理</h3>
  </div>
 <div style="position: relative; top: 5px;left: 800px">
 <a href="jsp/refer/updateReferStudent.jsp" style=" text-decoration: none;">添加</a></div><br><br>
 &emsp;&emsp;&emsp;查询条件：<input type="text">(姓名|电话|QQ)
 <br><br><br>
  <center>
  <h4 align="left" style="position:relative;left: 50px;color: orange ">查询结果</h4>
   <table width="90%" border="1px" bordercolor="#999999;">
    <tr height="20px"><th width="9%">姓名</th><th width="9%">电话</th><th width="9%">QQ</th><th width="15%">意向类型/班级</th><th width="9%">状态</th><th width="9%">营销人员</th><th width="9%">查看</th><th width="9%">编辑</th>
    <th width="9%">跟踪</th><th width="13%">录入学籍</th>
    </tr>
    <c:forEach var="refer" items="${ pageBean.list }">
    <tr align="center">
    <c:if test="pageBean.list!= null"></c:if>
     <td>${ refer.studentName}</td>
     <td>${ refer.telephone}</td>
     <td>${ refer.qq}</td>
     <td>${ refer.classId}</td>
     <td>${ refer.studentStatus}</td>
     <td>${ refer.staffId}</td>
     
     <td><a href="Refer_findReferStudent1?referId=${refer.referId}&pageCpde=${ pageBean.pageCode}"><img src="imgs/chakan.png" border="none"/></a></td>
     <td><a href="Refer_findReferStudent2?referId=${refer.referId}&pageCpde=${ pageBean.pageCode}"><img src="imgs/bianji.png" border="none"/></a></td>
     <td><a href="jsp/refer/addFollow.jsp"><img src="imgs/genzong.png" border="none"/></a></td>
     <td><a href="jsp/refer/addSchoolRoll.jsp" ><img src="imgs/luru.png" border="none"/></a></td>
    </tr>
    
   </c:forEach>
    <tr>
     <td colspan="6" align="right">
     <c:if test="${pageBean.pageCode>1 }">
     <a href="Refer_queryRefer?pageCode=${pageBean.pageCode-1 }" style="text-decoration: none;">上一页</a>
     </c:if>
     <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      <a href="Refer_queryRefer?pageCode=${pageCode }" style="text-decoration: none;">[${pageCode }]</a>
     </c:forEach>
     <c:if test="${pageBean.pageCode<pageBean.allPages }">
     <a href="Refer_queryRefer?pageCode=${pageBean.pageCode+1 }" style="text-decoration: none;">下一页</a>
     </c:if>
     <a href="Refer_queryRefer?pageCode=${pageBean.allPages }" style="text-decoration: none;">末页</a>
     </td>
     <td colspan="2">
       <form action="Refer_queryRefer">
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
