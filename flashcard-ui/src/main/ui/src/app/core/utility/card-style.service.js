angular.module('fc-app').service('fcCardStyle', function () {
    var srvc = this;

    var degree = 0;
    var deg = 0;
    var css = '';

    var tzCalculator = function (length) {
       return Math.round( ( 300 / 2 ) /
            Math.tan( ( ( Math.PI * 2 ) / length ) / 2 ) );
    };

    srvc.generateCss = function (cardsLength) {
        var tz = tzCalculator(cardsLength);
        degree = Math.round(360/cardsLength);
        /* jshint ignore:start */
        css = "'rotateY(" + deg + "deg)'";
        /* jshint ignore:end */
        deg = deg + degree;
        console.log(css);
        console.log(deg);
        return {
            '-webkit-transform' : 'rotateY(' + deg + 'deg) translateZ(288px)'
        };
    };
});