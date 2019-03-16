<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>教育经历</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/mywizardform.action" method="post">
	
		name:<input type="text" name="name" value="${person.name }"><br>
		
		<input type="submit" value="上一步" name="_target0">
		<input type="submit" value="取消" name="_cancel">
		<input type="submit" value="下一步" name="_target2">
	
	
	
	</form>
</body>
</html>