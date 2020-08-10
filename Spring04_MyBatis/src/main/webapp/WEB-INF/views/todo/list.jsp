<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/todo/list.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
</head>
<body>
	<div class="container">
		<a href="insertform.do">할일 추가</a>
		<h1>할일 목록 입니다</h1>
		<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>번호</th>
					<th>할일</th>
					<th>날짜</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tmp" items="${list }">
					<tr>
						<td>${tmp.num }</td>
						<td>${tmp.content }</td>
						<td>${tmp.regdate }</td>
						<td><a href="updateform.do?num=${tmp.num }">수정</a></td>
						<td><a href="delete?num=${tmp.num }">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>