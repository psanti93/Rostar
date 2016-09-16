/**
 * 
 */

//controllers for each state, can contain variables and functions to help generate template
angular.module("Rostar").controller("homeCtrl", function($state, $http){
	
});




angular.module("Rostar").controller("playerCtrl", function($state, $http){
	
var playerHomeData = this; 
playerHomeData.positions = [];

playerHomeData.showPositions = function ()
{
	
	$http({
		url: '/Rostar/positions',
		method: "GET",
		headers: {'Content-Type': 'application/json'}
	
	})
	.then(function(response){
		
		playerHomeData.positions = response.data;
		
	},
	function(response) {
		console.log("Failed.");
	});
	
	
}
playerHomeData.showPositions(); 

playerHomeData.deletedPlayer;

playerHomeData.deletePlayer = function ()
{	
	$http({
	 url: '/Rostar/delete/player',
	 method:'DELETE',
	 data: playerHomeData.deletedPlayer
	 ,
	 headers: {'Content-Type': 'application/json'}
	
	})		

}

	
	
	
});

angular.module("Rostar").controller("coachCtrl", function($state, $http){
	
});


/*service persists through entire request, used to store data throughout 
 * multiple views or store functions that are repeatedly used
 */
angular.module("Rostar").service("service", function($http, $state){
	
});