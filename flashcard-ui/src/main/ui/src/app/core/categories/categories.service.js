angular.module('fc-app').service('fcCategoryService', function ($http) {
    var srvc = this;

    srvc.save = function (category) {
        console.log(category);
        return $http.post('api/categories', category , {headers: {'Content-Type' : 'application/json'}});
    };

    srvc.getAll = function () {
        return $http.get('api/categories');
    };
});
