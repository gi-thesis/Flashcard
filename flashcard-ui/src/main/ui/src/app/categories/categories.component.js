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


    },
    controllerAs : 'categoriesCtrl'
});
