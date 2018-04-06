angular.module('fc-app').component('fcSessions', {
    bindings : {cards :  '<' },
    templateUrl : 'app/sessions/sessions.component.html',
    controller : function ($timeout, fcCardService, fcArrayUtils, fcCardStyle) {
        var ctrl = this;
        var counter = 0;

        ctrl.degree = 'red';
        ctrl.userGuess = '';

        ctrl.$onInit = function() {
            fcArrayUtils.shuffle(ctrl.cards);
            cardsNumber = ctrl.cards.length;
        };

        var tzCalculator = function (length) {
            return Math.round( ( 300 / 2 ) /
                Math.tan( ( ( Math.PI * 2 ) / length ) / 2 ) );
        };

        ctrl.getCurrentCardCss = function () {
            console.log(counter * -1);
            return ctrl.generateCss(counter * -1);
        };


        ctrl.count = function () {
            console.log(counter);
            return counter++;
        };

        ctrl.generateCss = function (index) {
            var deg = 0;
            var tz = tzCalculator(ctrl.cards.length);
            degree = Math.round(360/ctrl.cards.length);
            css = {'-webkit-transform' : 'rotateY(' + deg + 'deg) translateZ(288px)'};
            deg = degree * index;
            return {
                '-webkit-transform' : 'rotateY(' + deg + 'deg) translateZ(' + tz + 'px)'
            };
        };

        ctrl.sessionElement = function (el) {
            console.log(el);
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
