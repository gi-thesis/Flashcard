angular.module('fc-app').component('fcSessions', {
    bindings : {cards :  '<' },
    templateUrl : 'app/sessions/sessions.component.html',
    controller : function ($timeout, fcCardService, fcArrayUtils) {
        var ctrl = this;

        ctrl.userGuess = '';
        ctrl.$onInit = function() {
            fcArrayUtils.shuffle(ctrl.cards);
        };

        ctrl.guessing = function () {
            fcCardService.compareCards(ctrl.actualCard.back, ctrl.userGuess);
            $timeout(function () {
                ctrl.userGuess = '';
            }, 1000);
        };



    },
    controllerAs : 'sessionsCtrl'
});
