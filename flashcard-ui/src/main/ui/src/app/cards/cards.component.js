angular.module('fc-app').component('fcCards', {
    bindings : {cards : '<'},
    templateUrl : 'app/cards/cards.component.html',
    controller : function (fcCardService, $stateParams) {
        var ctrl = this;

        ctrl.clear = 'clear';
        ctrl.edit = 'edit';
        ctrl.card = {
            category : { id : $stateParams.categoryId}
        };

        ctrl.saveCard = function () {
           fcCardService.save(ctrl.card).then( function (value) {
               fcCardService.getAllByCategoryId($stateParams.categoryId).then(function (value) {
                   ctrl.cards = value.data;
               });
           });

        };

        ctrl.deleteCard = function (id) {
            fcCardService.deleteCard(id).then(function (value) {
                fcCardService.getAllByCategoryId($stateParams.categoryId).then(function (value) {
                    ctrl.cards = value.data;
                });
            });
        };

    },
    controllerAs : 'cardsCtrl'
});
