//if(document.readyState === 'loading') {
//    document.addEventListener('DOMContentLoaded', afterLoaded);
//} else {
//    afterLoaded();
//}

window.onload = function afterLoaded() {

    var password = document.getElementById('password');
    var confirm_password = document.getElementById('confirm_password');
    var meter = document.getElementById('password-strength-meter');
    var text = document.getElementById('password-strength-text');
    var meterfield = document.getElementById('meter-field');
    var strength = {
        0: "Worst",
        1: "Bad",
        2: "Weak",
        3: "Good",
        4: "Strong"
    }

    function confirmPassword(){
        if(password.value != confirm_password.value) {
            confirm_password.setCustomValidity("A jelszavak nem egyeznek!");
            confirm_password.style.backgroundColor = "#F44336";
            confirm_password.style.border = "1.5px solid #8B0000";
        } else {
            confirm_password.style.backgroundColor = "#80CBC4";
            confirm_password.style.border = "1.5px solid #388E3C";
            confirm_password.setCustomValidity('');
        }
    }

    password.addEventListener('input', function() {
            var val = password.value;
            var result = zxcvbn(val);

            // Update the password strength meter
            meter.value = result.score;

            // Update the text indicator
            if (val !== "") {
                meterfield.style.display = 'block';
                text.innerHTML = "Strength: " + strength[result.score];
            } else {
                text.innerHTML = "";
            }
        },true);
    password.addEventListener('blur', function () {
        meterfield.style.display = 'none';
    },true)

    password.addEventListener('input', confirmPassword, true);
    confirm_password.addEventListener('input', confirmPassword, true);

//password.oninput = validatePassword();
//confirm_password.oninput = validatePassword();
//submit.onclick = validatePassword();
}
