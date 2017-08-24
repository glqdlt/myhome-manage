angular.module('main', []).controller('mainCtrl', function($scope, $http) {
//	.success 는 1.4.3 버전까지 지원. 이후는 then 을 써야한다고 함.
	$http.get('/user/find/all').success(function(data) {
//		console.log(data);
		$scope.users = data;
	});
	

	$scope.submitUserForm = function() {
		
		var user = {name:$scope.name,id:$scope.id,address:$scope.address};
		console.log(user);
		var onSuccess = function(data, status, headers, config) {
			alert('User saved successfully.');
		};

		var onError = function(data, status, headers, config) {
			alert('Error occured.');
		}

		$http.post('/user/join2', {
			data : user
		}).success(onSuccess).error(onError);

	};
});

