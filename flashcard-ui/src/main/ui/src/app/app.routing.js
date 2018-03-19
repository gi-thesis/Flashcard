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
                url : '/fc',
                template : '<ui-view>'
            });

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
        $locationProvider.html5Mode(true);

    });/*.run(function ($transitions, fcUserAuthService, $state, $rootScope) {
        $transitions.onStart({entering : 'user.**'}, function () {
            if($rootScope.authenticated){
                console.log('landing');
                $state.go('profile');
            }
        });
    });*/

}(angular.module('fc-app')));
