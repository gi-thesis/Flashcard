angular.module('fc-app').component('fcSessions', {
    bindings : {cards :  '<' },
    templateUrl : 'app/sessions/sessions.component.html',
    controller : function () {
        var ctrl = this;

        var selectIndex = function (number) {
            var index = Math.floor(Math.random()* number + 1);
            console.log('index: ' + index);
            return index;
        };

        ctrl.$onInit = function() {
            console.log('length: ' + ctrl.cards.length);
            ctrl.actualCard = ctrl.cards[selectIndex(ctrl.cards.length - 1)];

            console.log(ctrl.actualCard);
        };
        ctrl.savSession = function () {

        };

    },
    controllerAs : 'sessionsCtrl'
});
