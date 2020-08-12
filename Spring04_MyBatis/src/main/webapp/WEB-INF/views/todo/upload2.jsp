<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/upload2.jsp</title>
</head>
<body>
<h1>파일 업로드 결과</h1>
<p>원본 파일명: <strong>${dto.orgFileName }</strong></p>
<p>저장된 파일명: <strong>${dto.saveFileName }</strong></p>
<p>파일의 크기: <strong>${dto.fileSize }</strong>byte</p>
<p>제목 : <strong>${dto.title }</strong></p>
</body>
</html>