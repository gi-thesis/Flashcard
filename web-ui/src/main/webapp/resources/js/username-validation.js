var username = $('#user_name');
var pathname = window.location.pathname;
var url = window.location.href;
var data = {
    'username' : username
}
$(document).ready(function() {
    $('#user_name').blur(function () {
        $.ajax({
            type: 'GET',
            url: '/api/users/exists',
            dataType: 'json',
            success: function (data) {
              console.log('success', data)
            }
        });
    });
});
