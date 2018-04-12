angular.module('fc-app').service('fcCategoryService', function ($http) {
    var srvc = this;

    srvc.save = function (category) {
        console.log(category);
        return $http.post('api/categories', category , {headers: {'Content-Type' : 'application/json'}});
    };

    srvc.getAllByUsername = function (username) {
        return $http.get('api/categories?username=' + username);
    };

    srvc.delete = function (id) {
        return $http.delete('api/categories/delete?id=' + id, {headers: {'Content-Type' : 'application/json'}});
    };
});
