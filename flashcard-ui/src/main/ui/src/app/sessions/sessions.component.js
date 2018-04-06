angular.module('fc-app').component('fcSessions', {
    bindings : {cards :  '<' },
    templateUrl : 'app/sessions/sessions.component.html',
    controller : function ($timeout, fcCardService, fcArrayUtils, fcCardStyle) {
        var ctrl = this;
        var counter = 0;
        var tz = 0;

        ctrl.degree = 'red';
        ctrl.userGuess = '';
        ctrl.index = 0;

        ctrl.$onInit = function() {
            fcArrayUtils.shuffle(ctrl.cards);
            cardsNumber = ctrl.cards.length;
        };



        var tzCalculator = function (length) {
            return Math.round( ( 300 / 2 ) /
                Math.tan( ( ( Math.PI * 2 ) / length ) / 2 ) );
        };

        ctrl.getCurrentCardCss = function () {
            return ctrl.generateCss(counter * -1, true);
        };


        ctrl.turnCard = function () {
            if(counter === ctrl.cards.length + 1) {
                counter = 0;
                return counter;
            }
            return counter++;
        };

        ctrl.generateCss = function (index, current) {
            var deg = 0;
            degree = Math.round(360/(ctrl.cards.length + 1));
            tz = tzCalculator(ctrl.cards.length + 1);
            if(current) {
                tz = -Math.abs(tz);
            }
            css = {'-webkit-transform' : 'rotateY(' + deg + 'deg) translateZ(288px)'};
            deg = degree * index;
            return {
                '-webkit-transform' : 'rotateY(' + deg + 'deg) translateZ(' + tz + 'px)'
            };
        };

        ctrl.guessing = function () {
            ctrl.getCurrentCardCss();
            counter++;
            fcCardService.compareCards(ctrl.cards[counter].back, ctrl.userGuess);
            $timeout(function () {
                ctrl.userGuess = '';
            }, 1000);
        };

    },
    controllerAs : 'sessionsCtrl'
});
