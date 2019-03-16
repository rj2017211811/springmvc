<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/personform.action" method="post">
		id:<input type="text" name="id"><br>
		name:<input type="text" name="name"><br>
		age:<input type="text" name="age"><br>
		<input type="submit" value="提交">
	
	
	
	</form>
</body>
</html>