<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<c:forEach var="Product" items="${mobileList}" varStatus="status">
			<li><a href="Details/${Product.id}">${Product.name}</a></li>
		</c:forEach>
	</ul>


</body>
</html>