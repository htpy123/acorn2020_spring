<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/updateform.jsp</title>
</head>
<body>
<div class="container">
	<h1>수정 폼 입니다</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="" />
		<div class="form-group">
		<label for="num">번호</label>
		<input type="text" id="num" class="form-control" value="" disabled />
		</div>
		<label for="context">해야 할일</label>
		<div class="form-group">
		<input type="text" id="context" name="context" class="form-control" value=""/>
		</div>
		<label for="regdate">날짜</label>
		<div class="form-group">
		<input type="text" id="regdate" name="regdate" class="form-control" value="" disabled/>
		</div>
		<button type="submit">수정</button>
	</form>
</div>
</body>
</html>