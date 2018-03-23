angular.module('fc-app').service('fcUserValidation', function ($http) {
    var srvc = this;

    srvc.userExists = function (userName) {
        return $http.get('api/users/exists', {params : {userName : userName}});
    };
});
