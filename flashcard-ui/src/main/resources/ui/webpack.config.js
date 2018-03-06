(function () {
    'use strict';

    const HtmlWebpackPlugin = require('html-webpack-plugin');
    const CleanPlugin       = require('clean-webpack-plugin');

    const contextPath   = '/flashcard';
    const targetFolder  = __dirname + '/../static';

    const plugins = [
        new CleanPlugin(targetFolder, { allowExternal: true }),
        new HtmlWebpackPlugin({
            template: './src/index.html'
        })
    ];

    module.exports = {
        mode: 'development',
        entry: {
            app: 'main.js',
            lib: 'lib.js'
        },
        output: {
            path: targetFolder,
            filename: '[name].js'
        },
        resolve: {
            extensions: [ '*', '.js' ],
            modules: [ 'node_modules', __dirname + '/src' ]
        },
        module: {
            rules: [{
                test: /.js$/,
                loaders: [ 'ng-annotate-loader' ]
            }]
        },
        plugins: plugins,
        devServer: {
            port: 10000,
            contentBase: targetFolder,
            historyApiFallback: {
                index: contextPath + '/index.html'
            },
            proxy: {
                '/api': {
                    target: 'http://localhost:9090'
                }
            }
        }
    };

}());
