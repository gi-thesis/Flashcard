var data = {
    'username' : $('#user_name')
}
$(document).ready(function() {
    $('#user_name').blur(function () {
        $.ajax({
            type: 'GET',
            url: 'api/user/exists',
            dataType: 'json',
            data: {username : $('#user_name').val()},
            success: function (response) {
              if(response.data == true){
                  $('#user_name').css("border-color", "red");
                  $('#user_name').get(0).setCustomValidity('A felhasználó név már létezik!');
              }else {
                  $('#user_name').css("border-color", "green");
                  $('#user_name').get(0).setCustomValidity('');
              }
            }
        });
    });
});
