angular.module('fc-app').service('fcUserService', function ($http) {
    var srvc = this;

    srvc.save = function (user) {
        return $http.post('api/users/', user);
    };
});
