/* Controllers */

var recruitingControllers = angular.module('recruitingControllers', []);

recruitingControllers.controller('CandidatesListCtrl', ['$scope', '$http',
    function ($scope, $http) {
        $http.get('/getAllCandidates').success(function (data) {
            $scope.orderByField = 'firstName';
            $scope.reverseSort = false;
            $scope.candidates = data;
        });
    }]);

recruitingControllers.controller('AddCandidateCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.add = function () {
        $http.post('/addCandidate', $scope.candidate).
            success(function () {
                alert("Candidate " + $scope.candidate.firstName + " " + $scope.candidate.lastName + " successfully added");
            });
    };
}]);