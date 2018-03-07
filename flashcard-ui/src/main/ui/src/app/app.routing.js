(function (appModule) {
    'use strict';

    appModule.config(function ($urlRouterProvider, $stateProvider, $locationProvider) {
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
    });

}(angular.module('fc-app')));
