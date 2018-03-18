angular.module('fc-app').component('fcHeaderLogin', {
    templateUrl : 'app/core/header-login/header-login.component.html',
    controller : function (fcUserAuthService) {
        var ctrl = this;

        //ctrl.isAuthenticated = fcUserAuthService.isAuthenticated;
    },
    controllerAs : 'headerLogin'
});
