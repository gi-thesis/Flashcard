var fcApp = angular.module("fc-app",['ui.router']);

fcApp.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

   $urlRouterProvider.otherwise('/');

   $stateProvider
       .state('landing', {
           url : '/',
           templateUrl : ''

       })
       .state('login', {
           url : '/login',
           templateUrl : 'app/login/login.component.html'
       })
       .state('registration', {
           url : '/registration',
           templateUrl : 'app/registration/registration.component.html',
       });
}]);
