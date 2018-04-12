angular.module('fc-app').component('fcProfile', {
    templateUrl: 'app/profile/profile.component.html',
    controller : function ($rootScope, fcUserAuthService, fcCategoryService, fcSessionService) {
        var ctrl = this;

        ctrl.edit = false;
        ctrl.sessions = null;

        ctrl.getCategoryId = function () {
            return ctrl.category.id;
        };

        ctrl.user = fcUserAuthService.getAuthUser();
        ctrl.$onInit = function () {
            fcCategoryService.getAllByUsername(ctrl.user.userName).then(function (value) {
                ctrl.categories = value.data; });
            fcSessionService.getAllByUserId(ctrl.user.id).then(function (value) {
                console.log(value);
                ctrl.sessions = value.data;
            });
        };


        ctrl.getSessions = function () {
            return fcSessionService.getAllByUserId($rootScope.loggedUser.id)
                .then(function (value) {
                    console.log(value);
                    ctrl.session = value;
                });
        };

        ctrl.toDate = function (long) {
            return long.toString('MM/dd/yy');
        };

    },
    controllerAs: 'profile'
});
