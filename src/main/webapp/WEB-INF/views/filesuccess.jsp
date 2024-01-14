<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="box">
		<h1 calss="text-centre" style="color:green">successful uploaded</h1>
</div>
<h1>${msg }</h1>

<!-- <img alt="uploaded image" src="c:url value="/resources/image/${filename }" />"</img> -->
<div class="container mt-5" style="height: 50px; width: 50px;">
    <img alt="uploaded image" src="<c:url value='/resources/image/${filename}' />" style="max-width: 80px; max-height: 90px%;" />
</div>

</body>
</html>