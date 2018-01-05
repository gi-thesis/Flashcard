//if(document.readyState === 'loading') {
//    document.addEventListener('DOMContentLoaded', afterLoaded);
//} else {
//    afterLoaded();
//}

window.onload = function afterLoaded() {

    var password = document.getElementById('password')
        , confirm_password = document.getElementById('confirm_password')
        , submit = document.getElementById("submit");

    function validatePassword(){
        if(password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
            confirm_password.style.backgroundColor = "#F44336";
            confirm_password.style.border = "#8B0000";
        } else {
            confirm_password.style.backgroundColor = "#80CBC4";
            confirm_password.style.border = "#004D40";
            confirm_password.setCustomValidity('');
        }
    }
    password.addEventListener('input', validatePassword, true)
    confirm_password.addEventListener('input', validatePassword, true)
//password.oninput = validatePassword();
//confirm_password.oninput = validatePassword();
//submit.onclick = validatePassword();
}
