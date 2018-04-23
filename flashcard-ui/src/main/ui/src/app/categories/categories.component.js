angular.module('fc-app').component('fcCategories', {
    templateUrl : 'app/categories/categories.component.html',
    controller : function ($rootScope, fcCategoryService, fcCardService) {
        var ctrl = this;
        ctrl.$onInit = function () {
            ctrl.getCategories();
        };
        ctrl.catergory = {};
        ctrl.saveCategory = function () {
            ctrl.category.user = $rootScope.loggedUser;
            fcCategoryService.save(ctrl.category).then(ctrl.getCategories);
        };
        ctrl.categories = {};
        ctrl.getCategories = function () {
            fcCategoryService.getAllByUsername($rootScope.loggedUser.userName).then(function (response) {
                ctrl.categories = response.data;
            });
        };
        ctrl.deleteCategory = function (category) {
            fcCardService.deleteAllCardByCategory(category.id).then(function (value) {
                ctrl.getCategories();
                fcCategoryService.delete(category.id).then(function (value) {
                    var idx = ctrl.categories.indexOf(category.id);
                    if (idx >= 0) {
                        ctrl.categories.splice(idx, 1);
                    }
                    ctrl.getCategories();
                });
            });
        };

    },
    controllerAs : 'categoriesCtrl'
});
