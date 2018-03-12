angular.module('fc-app').component('fcLogin', {
    templateUrl: 'app/login/login.component.html',
    controller : function ($rootScope, $scope, $http, $location) {
        var authenticate = function (credentials, callback) {
            var headers = credentials ? {
                    authorization: 'Basic ' + btoa(credentials.userName + ':' + credentials.password)
                }
                : {};

            $http.get('/login', {headers: headers}).success(function (data) {
                if (data.name) {
                    $rootScope.authenticated = true;
                } else {
                    $rootScope.authenticated = false;
                }
                callback() ;
            }).error(function () {
                $rootScope.authenticated = false;
                callback() ;
            });
        };

        authenticate();
        $scope.credentials = {};
        $scope.login = function () {
            authenticate($scope.credentials, function () {
                if ($rootScope.authenticated) {
                    $location.path('/profile');
                    $scope.error = false;
                } else {
                    $location.path('/login');
                    $scope.error = true;
                }
            });
        };
    },
    controllerAs: 'login'
});
