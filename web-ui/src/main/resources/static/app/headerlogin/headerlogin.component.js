angular.module("fc-app").component('fcHeaderlogin', {
    require : {
      'parent' : '^fcHeader'
    },
    templateUrl : 'app/headerlogin/headerlogin.component.html',
    controller : function ($scope) {
    },
    controllerAs : 'headerlogin'
});