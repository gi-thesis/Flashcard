angular.module('fc-app').service('fcUserAuthService', function ($http, $cookies) {
    var srvc = this;

    srvc.login = function (user) {
        return $http({
            method : 'post',
            url : 'login',
            headers : {
                'content-type' : 'x-www-form-urlencoding'
            },
            body : user
        });
    };

    /*!! to make boolean from anything*/
    srvc.isAuthenticated = function () {
        return !!$cookies.get('JSESSIONID');
    };


});