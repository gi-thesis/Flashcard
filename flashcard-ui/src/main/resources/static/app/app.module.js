var fcApp = angular.module('fc-app', ['ui.router']);

fcApp.config(['$stateProvider', '$urlRouterProvider', '$locationProvider', function ($stateProvider, $urlRouterProvider, $locationProvider) {
   $urlRouterProvider.otherwise('/');

   $stateProvider
       .state('landing', {
           url : '/',
           component : ''
       })
       .state('profile', {
           url : '/profile',
           component : 'fcProfile'
       })
       .state('login', {
           url : '/login',
           component : 'fcLogin'
       })
       .state('registration', {
           url : '/registration',
           component : 'fcRegistration',
       });

   $locationProvider.html5Mode(true);
}]);
