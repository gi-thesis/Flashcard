var password = document.getElementById("password")
var confirm_password = document.getElementById("confirm_password")

function validatePassword() {
    if(confirm_password != password){
        confirm_password.setCustomValidity("The password don't match")
    }else
        confirm_password.setCustomValidity("")
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;