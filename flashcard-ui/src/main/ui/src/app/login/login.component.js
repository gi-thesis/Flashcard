angular.module('fc-app').component('fcLogin', {
    templateUrl: 'app/login/login.component.html',
    controller : function ($state, fcUserAuthService, $cookies) {
        var ctrl = this;

        ctrl.user = {};
        ctrl.success = true;
        ctrl.login = function () {
            fcUserAuthService.login(ctrl.user).then(function () {
                $state.go('user.profile');

            }).catch(function () {
                ctrl.success = false;
            });

        };
    },
    controllerAs : 'login'
});
