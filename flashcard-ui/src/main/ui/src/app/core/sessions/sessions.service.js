angular.module('fc-app').service('fcSessionService', function ($http) {
    var srvc = this;

    srvc.save = function (session) {
        return $http.post('api/sessions', session , {headers: {'Content-Type' : 'application/json'}});
    };

    srvc.getAllByUserId = function (userId) {
        return $http.get('api/categories?username=' + username);
    };
});
