angular.module('fc-app').component('fcRegistration', {
    templateUrl: 'app/registration/registration.component.html',
    controller: function (fcUserService, $state, fcPasswordValidation) {
        var ctrl = this;
        //console.log(zxcvbn('valami'));
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
            fcUserService.userExists(userName).then( function (res) {
                ctrl.userExistsVal = true;
            }).catch(function (reason) {
                ctrl.userExistsVal = false;
            });
        };

        ctrl.passwordStrength = {};
        ctrl.calculatePasswordStrength = function() {
            ctrl.passwordStrength = fcPasswordValidation.passwordStrength(ctrl.user.password);
            console.log(ctrl.passswordStrength);
        };
    },
    controllerAs: 'registration'
});
