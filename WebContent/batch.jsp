<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.vir.dao.*"%>
<%@ page import="com.vir.model.*"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		 
			<% BatchServiceImpl bs=new BatchServiceImpl();
				List<Batch> al=new ArrayList<>();
				al=bs.getAllBatch();%>
				<form action="Enroll" method="post">
				<%for(Batch b: al)
				{
					System.out.println(b);
					%><%= b.getBatchID() %><br><%= b.getCourseID() %><br><%= b.getStartDate() %><br><%= b.getEndDate() %>
					<br><%= b.getPrice() %><br><%= b.getImg() %>
					<input type="submit" value="Enroll">
					<% 
					session.setAttribute("batch",b);
				    }
				
			        %>
			        </form>
			<ul>
			<c:forEach var="b" items="${al}">
    			<li><c:out value="${b}"/> </li>
    			<input type="submit" value="Enroll">
			</c:forEach>
			</ul>
			
		
</body>
</html>