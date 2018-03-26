angular.module('fc-app').service('fcPasswordValidation', function ($http) {
    var srvc = this;

    srvc.meter = document.getElementById('password-strength-meter');
    srvc.text = document.getElementById('password-strength-text');
    srvc.meterfield = document.getElementById('meter-field');
    var strength = {
        0: 'Bad',
        1: 'Bad',
        2: 'Weak',
        3: 'Good',
        4: 'Strong'
    };

    /*srvc.confirmPassword = function (elementPass, elementCPass) {
        if (elementPass !== elementCPass) {
            confirm_password.setCustomValidity("Passwords doesn't match!");
            confirm_password.style.backgroundColor = '#F44336';
            confirm_password.style.border = "1.5px solid #8B0000";
            return false;
        } else {
            confirm_password.style.backgroundColor = "#80CBC4";
            confirm_password.style.border = "1.5px solid #388E3C";
            confirm_password.setCustomValidity('');
            return true;
        }
    };*/

    srvc.passwordStrength = function (password) {
        console.log(password);
        if(!password){
            return undefined;
        }
        var result = {
            score : zxcvbn(password).score,
            text : ''
        };

        if (password !== '') {
            result.text = 'Strength: ' + strength[result.score];
        }
        return result;
    };
/*
    srvc.passwordStrengthValidator = function () {
        var val = password.value;
        var result = zxcvbn(val);
        if (result.score < 3) {
            password.setCustomValidity("The password isn't enough strong! (Strength must be at least good!)");
            password.style.borderColor = 'red';
        } else {
            password.style.borderColor = '#81d4fa';
            password.setCustomValidity("");
        }
        meterfield.style.display = 'none';
    };*/

   /* password.addEventListener('input', confirmPassword, true);
    confirm_password.addEventListener('input', confirmPassword, true);*/
});
