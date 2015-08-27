var recruitingApp = angular.module('recruitingApp', []);

recruitingApp.controller('CandidatesListCtrl', ['$scope', '$http',
    function ($scope, $http) {
        $http.get('/getAllCandidates').success(function(data) {
            $scope.candidates = data;
        });
    }]);

