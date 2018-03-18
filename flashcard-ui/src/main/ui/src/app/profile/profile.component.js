angular.module('fc-app').component('fcProfile', {
    templateUrl: 'app/profile/profile.component.html',
    controller : function ($http) {
        var ctrl = this;

        ctrl.user = {};

    },
    controllerAs: 'profile'
});
