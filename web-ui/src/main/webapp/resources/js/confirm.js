var password = document.getElementById("password")
    , confirm_password = document.getElementById("confirm_password");

function validatePassword(){
    if(password.value != confirm_password.value) {
        confirm_password.setCustomValidity("Passwords Don't Match");
        confirm_password.style.backgroundColor = "#F44336";
        confirm_password.style.border = "#8B0000";
    } else {
        confirm_password.setCustomValidity('');
    }
}

password.onchange = validatePassword();
confirm_password.onkeyup = validatePassword();