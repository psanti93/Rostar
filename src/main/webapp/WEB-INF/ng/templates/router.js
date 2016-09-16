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
		
				//the template is the html and the controller holds the functions and variable to help generate the template
				url: '/home',
				templateUrl: 'ng/templates/home.html',
				controller: 'homeCtrl as hc'
			})
			.state('playerState', {
				url: '/players',
				templateUrl: 'ng/templates/players.html',
				//pc has to be referred in the html 
				controller: 'playerCtrl as pc'
			})
			.state('coachState', {
				url: '/coach',
				templateUrl: 'ng/templates/coach.html',
				controller: 'coachCtrl as cc'
			})
		}
);