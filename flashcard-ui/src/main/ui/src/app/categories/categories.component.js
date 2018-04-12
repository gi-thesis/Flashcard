angular.module('fc-app').component('fcCategories', {
    templateUrl : 'app/categories/categories.component.html',
    controller : function ($rootScope, fcCategoryService) {
        var ctrl = this;

        ctrl.$onInit = function () {
            ctrl.getCategories();
        };

        ctrl.catergory = {};

        ctrl.saveCategory = function () {
            ctrl.category.user = $rootScope.loggedUser;
            console.log(ctrl.category);
            console.log($rootScope.loggedUser);
            fcCategoryService.save(ctrl.category).then(ctrl.getCategories);
        };

        ctrl.categories = {};
        ctrl.getCategories = function () {
            console.log(ctrl.category);
            console.log($rootScope.loggedUser.userName);
            fcCategoryService.getAllByUsername($rootScope.loggedUser.userName).then(function (response) {
                ctrl.categories = response.data;
            });
        };

        ctrl.deleteCategory = function (category) {
            ctrl.getCategories();
            fcCategoryService.delete(category.id).then(function (value) {
                var idx = ctrl.categories.indexOf(category.id);
                if (idx >= 0) {
                    ctrl.categories.splice(idx, 1);
                }
                ctrl.getCategories();
            });

        };

    },
    controllerAs : 'categoriesCtrl'
});
