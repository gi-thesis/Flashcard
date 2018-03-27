angular.module('fc-app').component('fcCategory', {
    bindings : {
      category : '='
    },
    templateUrl : 'app/category/category.component.html',
    controller : function (fcCategoryService) {
        var ctrl = this;

        //ctrl.catergory = category;
    },
    controllerAs : 'categoryCtrl'
});
