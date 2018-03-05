angular.module('fc-app').component('fcHeader', {
    templateUrl: 'app/core/header/header.component.html',
    controller: function () {
        var ctrl = this;
        ctrl.icon = 'picture_in_picture_alt';
    },
    controllerAs: 'header'
});
