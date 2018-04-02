angular.module('fc-app').component('fcCategory', {
    bindings : {
      category : '='
    },
    templateUrl : 'app/category/category.component.html',
    controller : function (fcCategoryService, $state) {
        var ctrl = this;

        ctrl.redirect = function (categoryId) {
            return $state.href('user.categories.cardmgmt', {categoryId : categoryId});
        };
        //ctrl.catergory = fcCategoryService;
    },
    controllerAs : 'categoryCtrl'
});
