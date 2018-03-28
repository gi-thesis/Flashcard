angular.module('fc-app').component('fcCards', {
    templateUrl : 'app/cards/cards.component.html',
    controller : function (cards, categoryId) {
        var ctrl = this;

        ctrl.cards = cards;

        ctrl.card = {};

        ctrl.saveCard = function () {
            console.log(categoryId);
            ctrl.card.categoryId = categoryId;

            fcCardService.save(ctrl.card).then();
        };

    },
    controllerAs : 'cardsCtrl'
});
