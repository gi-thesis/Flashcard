angular.module('fc-app').component('fcProfile', {
    templateUrl: 'app/profile/profile.component.html',
    controller : function (fcUserAuthService) {
        var ctrl = this;

        ctrl.user = fcUserAuthService.getAuthUser();

    },
    controllerAs: 'profile'
});
