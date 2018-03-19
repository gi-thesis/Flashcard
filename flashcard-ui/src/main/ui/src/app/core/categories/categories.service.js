angular.module('fc-app').service('fcCategoryService', function ($http) {
    var srvc = this;

    srvc.getCategories = function () {
        return $http.get('api/categories', {headers: {'Content-Type' : 'application/json'}});
    };
});
