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

        ctrl.editPopUp = false;
        ctrl.editCategory = function () {
            ctrl.editPopUp = true;
            console.log(ctrl.editPopUp);
        };

        ctrl.newFront = '';
        ctrl.newBack = '';
        ctrl.update = function () {
            var updatedCard = {
                user : $rootScope.loggedUser,
                id : ctrl.category.id,
                name : ctrl.newName,
                front : ctrl.newFront,
                back : ctrl.newBack
            };
            fcCardService.save(updatedCard).then(function (value) { ctrl.category = value.data; });
            ctrl.editPopUp = false;
        };

    },
    controllerAs : 'cardsCtrl'
});
