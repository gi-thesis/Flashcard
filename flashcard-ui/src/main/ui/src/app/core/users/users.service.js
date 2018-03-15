angular.module('fc-app').service('fcUserService', function ($http, fcUserLogin) {
    var srvc = this;


   return {
       login : function (user) {
           fcUserLogin.save(user);
       }
   }
});
