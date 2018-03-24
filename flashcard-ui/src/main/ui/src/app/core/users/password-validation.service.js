angular.module('fc-app').service('fcUserValidation', function ($http) {
    var srvc = this;

    srvc.password = null;
    srvc.confirm_password = null;
    srvc.meter = document.getElementById('password-strength-meter');
    srvc.text = document.getElementById('password-strength-text');
    srvc.meterfield = document.getElementById('meter-field');
    var strength = {
        0: "Bad",
        1: "Bad",
        2: "Weak",
        3: "Good",
        4: "Strong"
    };

    srvc.confirmPassword = function () {
        if (srvc.password !== srvc.confirm_password) {
            confirm_password.setCustomValidity("Passwords doesn't match!");
            confirm_password.style.backgroundColor = "#F44336";
            confirm_password.style.border = "1.5px solid #8B0000";
        } else {
            confirm_password.style.backgroundColor = "#80CBC4";
            confirm_password.style.border = "1.5px solid #388E3C";
            confirm_password.setCustomValidity('');
        }
    };

    srvc.passwordStrengthWatcher = function (passwordElement) {
        var val = passwordElement.value;
        var result = zxcvbn(val);

        // Update the password strength meter
        meter.value = result.score;

        // Update the text indicator
        if (val !== "") {
            text.innerHTML = "Strength: " + strength[result.score];
            meterfield.style.display = 'block';
        } else {
            text.innerHTML = "";
        }
    };

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
    };

    password.addEventListener('input', confirmPassword, true);
    confirm_password.addEventListener('input', confirmPassword, true);
});
