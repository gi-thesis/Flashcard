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
            authorization: 'Basic ' + btoa(credentials.userName + ':' + credentials.password),
            'Content-Type': 'application/json'
        } : { 'Content-Type': 'application/json'};

        $http.get('api/users/user', {headers: headers}).then(function (data) {
            console.log(data);
            if (data) {
                console.log('true');
                console.log(data);
                $rootScope.authenticated = true;
            } else {
                console.log('false');
                $rootScope.authenticated = false;
            }
            if(callback) {
                callback();
            }
        }).catch(function (e) {
            console.log(e);
            console.log('cfalse');
            $rootScope.authenticated = false;
            if(callback) {
                callback();
            }
        });

    };

    srvc.logout = function() {
        $http.post('logout', {}).then(function() {
            $rootScope.authenticated = false;
            $state.go('landing');
        }).catch(function(data) {
            $rootScope.authenticated = false;
        });
    };

});