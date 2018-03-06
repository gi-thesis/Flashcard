angular.module('fc-app').component('fcRegistration', {
    templateUrl: 'app/registration/registration.component.html',
    controller: function (fcUserService) {
        var ctrl = this;

        ctrl.user = {};

        ctrl.save = function () {
            fcUserService.save(ctrl.user).then(function (res) {
                console.log(res);
            });
        }
    },
    controllerAs: 'registration'
});
