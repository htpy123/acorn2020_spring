<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/insertform.jsp</title>
</head>
<body>
<div class="contaienr">
	<h1>할일 추가 폼입니다</h1>
	<form action="insert.do" method="post">
		<input type="text" id="context" name="context" placeholder="할일 입력..." />
		<button type="submit">등록</button>
	</form>
</div>

</body>
</html>