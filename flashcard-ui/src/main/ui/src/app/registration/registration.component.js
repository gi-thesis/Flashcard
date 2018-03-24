angular.module('fc-app').component('fcRegistration', {
    templateUrl: 'app/registration/registration.component.html',
    controller: function (fcUserService, $state, fcUserValidation) {
        var ctrl = this;

        ctrl.user = {};
        ctrl.confirmPassword = null;
        ctrl.success = true;
        ctrl.userExistsVal = null;
        ctrl.save = function () {
            fcUserService.save(ctrl.user).then(function (res) {
                console.log(res);
                $state.go('login');

            }).catch(function (reason) {
                console.log(reason);
                ctrl.success = false; });

        };

        ctrl.userExists = function (userName) {
            fcUserValidation.userExists(userName).then( function (res) {
                ctrl.userExistsVal = true;
            }).catch(function (reason) {
                ctrl.userExistsVal = false;
            });
        };
    },
    controllerAs: 'registration'
});
