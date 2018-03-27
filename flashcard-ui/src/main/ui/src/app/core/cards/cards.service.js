angular.module('fc-app').service('fcCardService', function ($http) {
    var srvc = this;

    srvc.save = function (card) {
        console.log(category);
        return $http.post('api/cards', card , {headers: {'Content-Type' : 'application/json'}});
    };

    srvc.getAllByCategoryId = function () {
        return $http.get('api/cards');
    };
});
