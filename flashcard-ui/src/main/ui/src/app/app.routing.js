(function (appModule) {
    'use strict';

    appModule.config(function ($urlRouterProvider, $stateProvider, $locationProvider , $httpProvider) {
        $urlRouterProvider.otherwise('/');

        $stateProvider
            .state('landing', {
                url : '/',
                component : ''
            })
            .state('user.profile', {
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
            })
            .state('user', {
                abstract : true,
                url : '/app',
                template : '<ui-view>'
            });

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
        $locationProvider.html5Mode(true);

    });/*.run(function ($transitions, fcUserAuthService, $state, $cookies) {
        $transitions.onStart({entering : 'user.**'}, function () {
            if(!fcUserAuthService.isAuthenticated()){
                console.log('landing');
                $state.go('profile');
            }
        });
    });*/

}(angular.module('fc-app')));
