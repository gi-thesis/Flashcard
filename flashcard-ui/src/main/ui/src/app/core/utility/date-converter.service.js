angular.module('fc-app').service('fcDateUtils', function () {
    var srvc = this;

    srvc.convertToDate = function (array) {
        var  i;
        var current = array;
        for (i = 0; i < array.length; i++) {
           current[i].date = new Date(array[i].date).toDateString();

        }
        return current;
    };
});