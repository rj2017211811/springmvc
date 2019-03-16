<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/mywizardform.action" method="post">
		id:<input type="text" name="id" value="${person.id }"><br>
		
		<input type="submit" value="取消" name="_cancel">
		<input type="submit" value="下一步" name="_target1">
	
	
	
	</form>
</body>
</html>