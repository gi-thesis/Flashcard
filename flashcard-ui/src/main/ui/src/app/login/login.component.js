angular.module('fc-app').component('fcLogin', {
    templateUrl: 'app/login/login.component.html',
    controller : function ($state, fcUserAuthService) {
        var ctrl = this;
        //TODO success and error callbacks
        ctrl.user = {};
        ctrl.success = true;

        ctrl.login = function () {
            fcUserAuthService.authentication(ctrl.user, function() {
                console.log($rootScope.loggedUser);
                $state.go('user.profile');
            }, function () {
                $state.go('login');
                ctrl.success = false;
            });
        };
    },
    controllerAs : 'login'
});
