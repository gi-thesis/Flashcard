angular.module('fc-app').service('fcUserService', function ($http) {
    var srvc = this;
    srvc.save = function (user) {
        return $http.post('api/users/', user);
    };
    srvc.userExists = function (userName) {
        return $http.get('api/users/exists', {params : {userName : userName}});
    };
});
