<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RAISE A COMPLAINT ON SEWAGE ON STREET</title>
</head>
<body>
<form:form method="post" modelAttribute="complaints" action="${pageContext.request.contextPath}/getinsert">
<center>
<form:label path="department">Department</form:label>
<form:input path="department" maxlength="30" size="30"/>
<form:errors path="department" cssClass="error"/><br>
<form:label path="complaint">Complaint</form:label>
<form:password path="complaint" maxlength="30" size="30"/>
<form:errors path="complaint" cssClass="error"/>
<br>
<input type="submit" value="insert"/>
<input type="reset" value="reset"/>
</center>
</form:form>
</body>
</html>