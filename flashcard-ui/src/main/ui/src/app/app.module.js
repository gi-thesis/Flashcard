angular.module('fc-app', [ 'ui.router', 'ngCookies' ]);
require('./app.routing');

require('./core/users/users.service');
require('./core/users/users-auth.service');
require('./core/users/users-validation.service');
require('./core/users/password-validation.service');
require('./core/categories/categories.service');
require('./core/cards/cards.service');
require('./core/sessions/sessions.service');

require('./core/header/header.component');
require('./core/header-login/header-login.component');

require('./login/login.component');
require('./registration/registration.component');
require('./profile/profile.component');
require('./categories/categories.component');
require('./category/category.component');
require('./cards/cards.component');
require('./sessions/sessions.component');
