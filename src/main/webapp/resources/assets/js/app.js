/* App Module */

var recruitingApp = angular.module('recruitingApp', [
  'ui.bootstrap',
  'ngRoute',
  'recruitingControllers'
]);

recruitingApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
        when('/', {
          templateUrl: 'resources/candidates-list.html',
          controller: 'CandidatesListCtrl'
        }).
        when('/add', {
          templateUrl: 'resources/add-candidate.html',
          controller: 'AddCandidateCtrl'
        }).
        otherwise({
          redirectTo: '/'
        });
  }]);

