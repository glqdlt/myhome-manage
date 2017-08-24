angular.module('hello', []).controller('home', function($scope, $http) {
//	.success 는 1.4.3 버전까지 지원. 이후는 then 을 써야한다고 함.
	$http.get('/user/find/all').success(function(data) {
		console.log(data);
		$scope.users = data;
	})
});