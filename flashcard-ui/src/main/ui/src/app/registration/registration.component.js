angular.module('fc-app').component('fcRegistration', {
    templateUrl: 'app/registration/registration.component.html',
    controller: function (fcUserService, $state) {
        var ctrl = this;

        ctrl.user = {};
        ctrl.success = true;
        ctrl.save = function () {
            fcUserService.save(ctrl.user).then(function (res) {
                console.log(res);
                $state.go('login');

            }).catch(function (reason) { ctrl.success = false; });

        };
    },
    controllerAs: 'registration'
});
