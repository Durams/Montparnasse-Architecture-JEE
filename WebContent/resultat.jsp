<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Récupération des informations</h2>
<!--Nom = <c:out value = "${nom}" />
Prenom = <c:out value ="${prenom}" />
Id = <c:out value ="${id}" />
Age = <c:out value = "${age}" /> </br>-->

<c:out value= "${message }"/>

</body>
</html>