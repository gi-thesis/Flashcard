angular.module('fc-app').component('fcProfile', {
    templateUrl: 'app/profile/profile.component.html',
    controller : function (fcUserAuthService, fcCategoryService) {
        var ctrl = this;

        ctrl.edit = false;
        ctrl.getCategoryId = function () {
            return ctrl.category.id;
        };
        //ctrl.category = null;
        //ctrl.categories = {};
        ctrl.user = fcUserAuthService.getAuthUser();
        ctrl.$onInit = function () {
            fcCategoryService.getAllByUsername(ctrl.user.userName).then(function (value) {
                console.log(value.data);
                ctrl.categories = value.data; });
        };



    },
    controllerAs: 'profile'
});
