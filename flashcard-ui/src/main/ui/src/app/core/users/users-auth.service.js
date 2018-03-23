angular.module('fc-app').service('fcUserAuthService', function ($rootScope, $http) {
    var srvc = this;

    /*!! to make boolean from anything*/
    srvc.isAuthenticated = function () {
        return $rootScope.loggedUser;
    };

    srvc.authentication = function (credentials, successCallback, errorCallback) {
        var headers = credentials ? {
            authorization: 'Basic ' + btoa(credentials.userName + ':' + credentials.password),
            'Content-Type': 'application/json'
        } : { 'Content-Type': 'application/json'};

        $http.get('api/users/user', {headers: headers}).then(function (data) {
            console.log(data);
            if (data.data) {
                $rootScope.loggedUser = data.data.principal.user;
            }
            if(successCallback) {
                successCallback();
            }
        }).catch(function (e) {
            if(errorCallback) {
                errorCallback();
            }
        });

    };

    srvc.logout = function(callback) {
        $http.post('logout', {}).then(function() {
            if(callback) {
                $rootScope.loggedUser = undefined;
                callback();
            }
        }).catch(function(data) {
            $rootScope.loggedUser = undefined;
            if(callback) {
                callback();
            }
        });
    };

    srvc.getAuthUser = function () {
        return $rootScope.loggedUser;
    };

});