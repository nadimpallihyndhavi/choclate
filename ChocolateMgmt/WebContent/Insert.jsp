<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<H1>Insert Chocolate Details</H1>
	<sf:form modelAttribute="my" action="insertChocAction">
		<table>
			<tr>
				<td><sf:input path="chocName" placeholder="Chocolate Name" /></td>
			</tr>
			<tr>
				<td><sf:input path="chocPrice" placeholder="Chocolate Price" />
				</td>
			</tr>
			<tr>
				<td><sf:input path="chocId" placeholder="Chocolate ID" /></td>
			</tr>
			<tr>
				<td><sf:input path="chocQty" placeholder="Chocolate Quantity" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Insert"></td>
			</tr>
		</table>
	</sf:form>
</body>
</html>