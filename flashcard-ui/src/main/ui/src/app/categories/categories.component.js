angular.module('fc-app').component('fcCategories', {
    templateUrl : 'app/categories/categories.component.html',
    controller : function (fcCategoryService) {
        var ctrl = this;

        ctrl.$onInit = function () {
            ctrl.getCategories();
        };
        ctrl.catergory = {};

        ctrl.saveCategory = function () {
            fcCategoryService.save(ctrl.category).then(ctrl.getCategories);
        };

        ctrl.categories = {};
        ctrl.getCategories = function () {
            fcCategoryService.getAll().then(function (response) {
                ctrl.categories = response.data;
            });
        };


    },
    controllerAs : 'categoriesCtrl'
});
