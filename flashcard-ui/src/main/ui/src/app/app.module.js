angular.module('fc-app', [ 'ui.router' ]);
require('./app.routing');

require('./core/users/users.service');

require('./core/header/header.component');
require('./core/header-login/header-login.component');

require('./login/login.component');
require('./registration/registration.component');
