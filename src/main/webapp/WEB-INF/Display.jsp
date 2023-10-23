<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.*" %>
<body>
<h2>Complaint on sewage is successfull</h2>
<%Random rand = new Random();int randomnumber = rand.nextInt(90000) + 10000;%>
Ticket ID:<input type="text" name="ticketid" value="<%=randomnumber%>"/><br/>
<h3>Customer List</h3>
	<c:if test="${!empty listOfComplaints}">
		<table class="tg">
			<tr>
				<th width="80">Id</th>
				<th width="120">department</th>
				<th width="120">complaint</th>
			</tr>
			<c:forEach items="${listOfComplaints}" var="complaints">
				<tr>
					<td>${username.id}</td>
					<td>${complaints.department}</td>
					<td>${complaints.complaint}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>