angular.module('fc-app').component('fcHeaderLogin', {
    templateUrl : 'app/core/header-login/header-login.component.html',
    controller : function ($state, fcUserAuthService) {
        var ctrl = this;

        ctrl.isAuthenticated = fcUserAuthService.isAuthenticated;

        ctrl.login = function () {
            fcUserAuthService.authentication(ctrl.user, function() {
                $state.go('user.profile');
            }, function () {
                $state.go('login');
                ctrl.success = false;
            });
        };

        ctrl.logout = function() {
            fcUserAuthService.logout(function () {
                $state.go('landing');
            });
        };


        },
    controllerAs : 'headerLogin'
});
