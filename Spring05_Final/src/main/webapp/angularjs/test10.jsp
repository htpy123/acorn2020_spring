<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../resources/js/angular.min.js"></script>
</head>
<body>
	<h1>체크 박스를 테스트 해 보세요</h1>
	<label>
		<input type="checkbox" ng-model="isShow" /> isShow
	</label>
	<label>
		<input type="checkbox" ng-model="isMake" /> isMake
	</label>
	<!-- 문서객체를 보익 숨기고를 조작하는 지시어는 ng-show -->
	<p ng-show="isShow">안녕하세요</p>
	<!-- 문서객체를 동적으로 만들고 제거하고를 조작하는 지시어는 ng-if -->
	<p ng-if="isMake">또 만났군요!</p>
</body>
</html>