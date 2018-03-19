angular.module('fc-app').component('fcHeaderLogin', {
    templateUrl : 'app/core/header-login/header-login.component.html',
    controller : function ($http, $rootScope, fcUserAuthService) {
        var ctrl = this;

        ctrl.logout = function () {
            $http.post('logout', {}).then(function() {
                $rootScope.authenticated = false;
                console.log('landing-logout');
                $state.go('landing');
            }).catch(function(data) {
                console.log(data);
                $rootScope.authenticated = false;
            });
        };
        console.log($rootScope.authenticated);
        ctrl.isAuthenticated = function () {
            return $rootScope.authenticated;
        };
        //ctrl.isAuthenticated = fcUserAuthService.isAuthenticated;
    },
    controllerAs : 'headerLogin'
});
