if(document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', afterLoaded);
} else {
    afterLoaded();
}

function afterLoaded() {

    var password = document.getElementById('password')
        , confirm_password = document.getElementById('confirm_password')
        , submit = document.getElementById("submit");

    function validatePassword(){
        if(password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
            confirm_password.style.backgroundColor = "#F44336";
            confirm_password.style.border = "#8B0000";
        } else {
            confirm_password.setCustomValidity('');
        }
    }

password.onkeyup = validatePassword();
confirm_password.oninput = validatePassword();
//submit.onclick = validatePassword();
}
