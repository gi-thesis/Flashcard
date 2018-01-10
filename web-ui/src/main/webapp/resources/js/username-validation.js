var data = {
    'username' : $('#user_name')
}
$(document).ready(function() {
    $('#user_name').blur(function () {
        $.ajax({
            type: 'GET',
            url: 'api/users/exists',
            dataType: 'json',
            data: {username : $('#user_name').val()},
            success: function (response) {
              if(response.data == true){
                  console.log('succes',response.data);
                  $('#user_name').css("border-color", "red");
              }
            }
        });
    });
});
