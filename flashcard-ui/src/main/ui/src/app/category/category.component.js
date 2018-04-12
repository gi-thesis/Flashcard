angular.module('fc-app').component('fcCategory', {
    bindings : {
      category : '='
    },
    templateUrl : 'app/category/category.component.html',
    controller : function (fcCategoryService, $state) {
        var ctrl = this;

        ctrl.clear = 'clear';
        ctrl.edit = 'mode edit';
        ctrl.content = 'content copy';
        ctrl.editPopUp = false;
        ctrl.redirect = function (categoryId) {
            return $state.href('user.categories.cardmgmt', {categoryId : categoryId});
        };
        //ctrl.catergory = fcCategoryService;

        ctrl.editCategory = function () {
            ctrl.editPopUp = true;
            console.log(ctrl.editPopUp);
        };
    },
    controllerAs : 'categoryCtrl'
});
