angular.module('fc-app').component('fcCards', {
    bindings : {cards : '<'},
    templateUrl : 'app/cards/cards.component.html',
    controller : function (fcCardService, $stateParams) {
        var ctrl = this;

        ctrl.card = {
            category : { id : $stateParams.categoryId}
        };

        ctrl.saveCard = function () {
           fcCardService.save(ctrl.card);

           fcCardService.getAllByCategoryId($stateParams.categoryId).then(function (value) {
               console.log(value);
               ctrl.cards = value.data; });
        };

    },
    controllerAs : 'cardsCtrl'
});
