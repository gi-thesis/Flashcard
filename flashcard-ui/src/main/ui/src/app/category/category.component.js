angular.module('fc-app').component('fcCategory', {
    bindings : {
      category : '='
    },
    templateUrl : 'app/category/category.component.html',
    controller : function ($rootScope, fcCategoryService, $state) {
        var ctrl = this;

        ctrl.clear = 'clear';
        ctrl.edit = 'mode edit';
        ctrl.content = 'content copy';
        ctrl.editPopUp = false;
        ctrl.redirect = function (categoryId, fcCategories) {
            return $state.href('user.categories.cardmgmt', {categoryId : categoryId});
        };
        //ctrl.catergory = fcCategoryService;

        ctrl.editCategory = function () {
            ctrl.editPopUp = true;
            console.log(ctrl.editPopUp);
        };

        ctrl.newName = '';
        ctrl.update = function () {
            var updatedCategory = {
                user : $rootScope.loggedUser,
                id : ctrl.category.id,
                name : ctrl.newName
            };
            fcCategoryService.save(updatedCategory).then(function (value) { ctrl.category = value.data; });
            ctrl.editPopUp = false;
        };

        ctrl.delete = function (categoryId) {
            fcCategoryService.delete(categoryId).then(function (value) { $state.go('user.categories'); });

        };
    },
    controllerAs : 'categoryCtrl'
});
