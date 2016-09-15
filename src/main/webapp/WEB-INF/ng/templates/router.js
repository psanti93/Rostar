/**
 * 
 */
//creating and dependantly injecting services
angular.module("Rostar", ['ui.router', 'ngRoute', 'ui.bootstrap','ngAnimate']);


//configuration, define states
angular.module("Rostar").config(
		
		function($stateProvider, $urlRouterProvider){
			
			//template for home page
			$urlRouterProvider.otherwise('/home');
			
			//states define a url, template and controller
			$stateProvider
			.state('homeState', {
				url: '/home',
				templateUrl: 'ng/templates/home.html',
				controller: 'homeCtrl as hc'
			})
			.state('playerState', {
				url: '/players',
				templateUrl: 'ng/templates/players.html',
				controller: 'playerCtrl as pc'
			})
			.state('coachState', {
				url: '/coach',
				templateUrl: 'ng/templates/coach.html',
				controller: 'coachCtrl as cc'
			})
		}
);