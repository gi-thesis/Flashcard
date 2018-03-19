angular.module('fc-app').component('fcCategories', {
    templateUrl : 'app/categories/categories.component.html',
    controller : function (fcCategoryService) {
        var ctrl = this;

        ctrl.categories = {};
        fcCategoryService.getCategories().then(function (response) {
            ctrl.categories = response.data;
        });
    },
    controllerAs : 'categoriesCtrl'
});
