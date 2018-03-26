(function (appModule) {
    'use strict';

    appModule.config(function ($urlRouterProvider, $stateProvider, $locationProvider , $httpProvider) {
        $urlRouterProvider.otherwise('/');

        $stateProvider
            .state('landing', {
                url : '/',
                component : ''
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
            })
            .state('user.profile', {
                url : '/profile',
                component : 'fcProfile'
            })
            .state('user.categories', {
                url : '/categories',
                component : 'fcCategories'
            })
            .state('user.categories.view', {
                url : '/:categoryId',
                component : 'fcCards'
            });

        $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
        $locationProvider.html5Mode(true);

    }).run(function ($transitions, fcUserAuthService, $state) {
        $transitions.onStart({entering : 'user.**'}, function () {
            fcUserAuthService.authentication(null, null, function () {
                $state.go('login');
            });
        });
    });

}(angular.module('fc-app')));
