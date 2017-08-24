angular.module('hello', [])
  .controller('home', function($scope, $http) {
  $http.get('/user/find/all').success(function(data) {
    $scope.user = data;
  })
});