angular.module('fc-app').component('fcHeaderLogin', {
    templateUrl : 'app/core/header-login/header-login.component.html',
    controller : function ($rootScope, fcUserAuthService) {
        var ctrl = this;

        console.log($rootScope.authenticated);
        ctrl.isAuthenticated = function () {
            return $rootScope.authenticated;
        };
        //ctrl.isAuthenticated = fcUserAuthService.isAuthenticated;
    },
    controllerAs : 'headerLogin'
});
