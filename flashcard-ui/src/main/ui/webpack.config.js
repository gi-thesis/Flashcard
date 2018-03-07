(function () {
    'use strict';

    var HtmlWebpackPlugin = require('html-webpack-plugin');
    var CleanPlugin       = require('clean-webpack-plugin');

    var contextPath   = '/flashcard';
    var targetFolder  = __dirname + '/../resources/static';

    var plugins = [
        new CleanPlugin(targetFolder, { allowExternal: true }),
        new HtmlWebpackPlugin({
            template: './src/index.html'
        })
    ];

    module.exports = {
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
                test: /\.js$/, // include .js files
                enforce: "pre", // preload the jshint loader
                exclude: /node_modules/, // exclude any and all files in the node_modules folder
                use: [{
                    loader: "jshint-loader",
                    options: {
                        camelcase: true,
                        emitErrors: false,
                        failOnHint: false
                    }
                }]
            }, {
                test: /\.js$/,
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
