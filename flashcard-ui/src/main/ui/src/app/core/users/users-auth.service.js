angular.module('fc-app').service('fcUserAuthService', function ($rootScope, $http, $cookies, $state) {
    var srvc = this;

    srvc.login = function (user) {
        console.log(user);
        return $http({
            method: 'post',
            url: 'login',
            headers: {
                'content-type': 'x-www-form-urlencoding'
            },
            body: user
        });
    };

    /*!! to make boolean from anything*/
    srvc.isAuthenticated = function () {
        return !!$cookies.get('JSESSIONID');
    };

    srvc.authentication = function (credentials, callback) {
        var headers = credentials ? {
            authorization: 'Basic ' + btoa(credentials.userName + ':' + credentials.password)
        } : {};

        $http.get('user', {headers: headers}).then(function (data) {
            console.log(data.name.toString());
            if (data) {
                console.log('true');
                $rootScope.authenticated = true;
            } else {
                console.log('false');
                $rootScope.authenticated = false;
            }
            if(callback) {
                callback();
            }
        }).catch(function () {
            console.log('cfalse');
            $rootScope.authenticated = false;
            if(callback) {
                callback();
            }
        });

    };

});