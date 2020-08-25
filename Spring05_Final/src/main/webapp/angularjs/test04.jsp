<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/angularjs/test03.jsp</title>
<!-- bootstrap css 로딩 시키기 -->
<link rel="stylesheet" href="../resources/css/bootstrap.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/resources/js/angular.min.js"></script>
</head>
<!-- body 에서 일어나는 일은 angular 로 관리를 하겠다는 의미 -->
<body ng-app>
<div class="container">
	<h1 ng-init="a='btn-primary'">클래스 속성 조작하기</h1>
	<input type="text" ng-model="b"/><br />
	<button class="btn btn-primary">버튼 1</button>
	<button class="btn {{a}}">버튼 2</button>
	<button class="btn {{b}}">버튼 3</button>
	<button ng-class="['btn','btn-primary']">버튼 4</button>
	<button ng-class="{'btn':true, 'btn-primary':true}">버튼 5</button>
	<br />
	<input type="checkbox" ng-model="isLarge" />
	<button class="btn btn-success" ng-class="{'btn-lg':isLarge}">버튼 6</button>
</div>	
</body>
</html>













