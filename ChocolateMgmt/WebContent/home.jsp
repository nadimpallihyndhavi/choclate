<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>List of All Chocolates:</h1>
	<table border="2">
		<tr>
			<th>Chocolate Id
			<th>Chocolate Name
			<th>Chocolate Price
			<th> Chocolate Quantity <c:forEach items="${list}" var="Choc">
					<tr>
						<td>"${Choc.chocId}"
						<td>"${Choc.chocName}"
						<td>"${Choc.chocPrice}"
						<td>"${Choc.chocQty}"
						</td>
						</tr>
				</c:forEach>
	</table>
</body>
</html>