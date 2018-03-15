angular.module('fc-app').service('fcUserLogin', function ($http) {
    var srvc = this;


    srvc.save = function (user) {
        return $http.post('api/users/', user);
    };
});