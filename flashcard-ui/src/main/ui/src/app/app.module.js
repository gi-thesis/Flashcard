angular.module('fc-app', [ 'ui.router', 'ngCookies' ]);
require('./app.routing');

require('./core/users/users.service');
require('./core/users/users-auth.service.js');

require('./core/header/header.component');
require('./core/header-login/header-login.component');

require('./login/login.component');
require('./registration/registration.component');
require('./profile/profile.component');
