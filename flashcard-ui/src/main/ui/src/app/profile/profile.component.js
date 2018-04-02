angular.module('fc-app').component('fcProfile', {
    templateUrl: 'app/profile/profile.component.html',
    controller : function (fcUserAuthService, fcCategoryService) {
        var ctrl = this;

        ctrl.user = fcUserAuthService.getAuthUser();
        fcCategoryService.getAllByUsername(ctrl.user.userName).then(function (value) {
            console.log(value.data);
            ctrl.categories = value.data; });
    },
    controllerAs: 'profile'
});
