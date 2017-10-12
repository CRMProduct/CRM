<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
    function isRemove(){
    	var msg = confirm("确定要删除吗？");
    	if(msg == true){
    		return true;
    	}else {
    		return false;
    	}
    }
</script>
</head>
<body>
   <h3> 欢迎,${teacherName }</h3>
   <table width="60%" align="center">
      <caption>教师信息表</caption>
      <tr>
        <th>编号</th><th>姓名</th><th>密码</th><th>注册时间</th> <th>登录次数</th><th>最近登录</th><th>状态</th><th>操作</th>
      </tr>
      <c:forEach var="teacher" items="${pageBean.list }">
      <tr align="center">
         <td>${teacher.teacherId }</td>
         <td>${teacher.teacherName }</td>
         <td>${teacher.teacherPass }</td>
         <td>${teacher.registTime }</td>
         <td>${teacher.loginCount }</td>
         <td>${teacher.lastLogin }</td>
         <td>${teacher.teacherStatus }</td>
         <td>
            <a href="FindServlet?teacherId=${teacher.teacherId }&pageCode=${pageBean.pageCode }">更新</a> 
            <a href="RemoveServlet?teacherId=${teacher.teacherId }&pageCode=${pageBean.pageCode }" onclick="return isRemove()">删除</a>
         </td>
      </tr>
      </c:forEach>
      <tr>
       <td colspan="6" align="right">
       
       <c:if test="${pageBean.pageCode > 1 }">
          <a href="QueryServlet?pageCode=${pageBean.pageCode-1 }">上一页</a>
       </c:if>
       <c:forEach var="pageCode" begin="1" end="${pageBean.allPages }">
      	 <a href="QueryServlet?pageCode=${pageCode }">[${pageCode }]</a>
       </c:forEach>
       <c:if test="${pageBean.pageCode < pageBean.allPages }">
          <a href="QueryServlet?pageCode=${pageBean.pageCode+1 }">下一页</a>
       </c:if>
       <a href="QueryServlet?pageCode=${pageBean.allPages }">末页</a>
       </td>
       <td>
          <form action="QueryServlet">
            <input type="text" name="pageCode" size="2"/>
            <input type="submit" value="GO"/>
          </form>
       </td>
       <td>
                      共${pageBean.allPages }页
       </td>
      </tr>
   </table>
     
</body>
</html>