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
	<h2>${selectedMobile.id}</h2>
	<h2>${selectedMobile.name}</h2>
	<h2>${selectedMobile.brandName}</h2>
	<img alt="" src="${selectedMobile.image}">
</body>
</html>