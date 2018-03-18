angular.module('fc-app').component('fcLogin', {
    templateUrl: 'app/login/login.component.html',
    controller : function ($rootScope, $state, fcUserAuthService, $cookies) {
        var ctrl = this;

        ctrl.user = {};
        ctrl.success = false;
        ctrl.login = function () {
            fcUserAuthService.authentication();
            ctrl.credentials = {};
            fcUserAuthService.authentication(ctrl.user, function() {
                if ($rootScope.authenticated) {
                    console.log('user.profile');
                    $state.go('user.profile');
                    ctrl.success = true;
                } else {
                    console.log('login');
                    console.log($rootScope.authenticated);
                    $state.go('login');
                    ctrl.error = false;
                }
            });

        };
    },
    controllerAs : 'login'
});
