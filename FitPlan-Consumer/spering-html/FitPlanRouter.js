angular.module('fitPlanApp', [])
  .controller('FitPlanController', ['$scope', '$http', function($scope, $http) {

    $scope.welcome = "";
    $scope.showWelcome = false;

    //Get the welcome message
    $http.get("http://localhost:8080/fitplan/welcome").then(function(response) {
      $scope.welcome = response.data.message;
      $scope.showWelcome = true;
    }, function(error) {
      console.log(error);
    });

    $scope.closePopup = function() {
      $scope.showWelcome = false;
    };
  }])