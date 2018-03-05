angular.module("fc-app").component('fcRegistrationForm', {
    templateUrl : 'app/registration/registration.component.html',
    controller : function (fcUserService) {
        var ctrl = this;

        ctrl.user = {};
        ctrl.save = function () {
            console.log("Save init")
            fcUserService.save(ctrl.user).then(function (res) {
                console.log(res);
            });
        }
    },
    controllerAs : 'registration'
});