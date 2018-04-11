(function (appModule) {
    'use strict';

    appModule.config(function ($urlRouterProvider, $stateProvider, $locationProvider , $httpProvider) {
        $urlRouterProvider.otherwise('/');

        $stateProvider
            .state('landing', {
                url : '/',
                component : 'fcLanding'
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
            .state('user.cardmgmt', {
                url : '/:categoryId/cards',
                component : 'fcCards',
                resolve : {
                    cards: function ($stateParams, fcCardService) {
                        return fcCardService.getAllByCategoryId($stateParams.categoryId).then(function (value) { return value.data; });
                    }
                }
            }).state('user.session', {
                url : '/session?categoryId',
                component : 'fcSessions',
                resolve : {
                    cards: function ($stateParams, fcCardService) {
                        return fcCardService.getAllByCategoryId($stateParams.categoryId).then(function (value) { return value.data; });
                    }
                }
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
