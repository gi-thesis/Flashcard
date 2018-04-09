angular.module('fc-app').service('fcCardService', function ($http) {
    var srvc = this;

    srvc.save = function (card) {
        return $http.post('api/cards', card , {headers: {'Content-Type' : 'application/json'}});
    };

    srvc.getAllByCategoryId = function (categoryId) {
        return $http.get('api/cards?categoryId=' + categoryId);
    };
    
    srvc.getCard = function (card) {
        
    };

    srvc.compareCards = function (userGuess, cardBack) {
        if(!userGuess  || !cardBack) {
            return false;
        }
        console.log(userGuess + cardBack);
        return userGuess.toLowerCase().trim() === cardBack.toLowerCase().trim();
    };
});
