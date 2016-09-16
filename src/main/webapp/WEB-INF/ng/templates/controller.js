/**
 * 
 */

//controllers for each state, can contain variables and functions to help generate template
angular.module("Rostar").controller("homeCtrl", function($state, $http){});

angular.module("Rostar").controller("playerCtrl", function($state, $http){
	
});

angular.module("Rostar").controller("coachCtrl", function($state, $http){
	var cc = this;
	cc.addPlayer = 0;
	cc.playerFirstName;
	cc.playerLastName;
	cc.coach;
	cc.position;
	cc.selection = "Select Position";
	cc.coaches = [];
	cc.positions = [];
	
	$http({
		method: "GET",
		url: "coaches"
	})
	.then(
		function(response){
			cc.coaches = response.data;
		}	
	)
	
	$http({
		method: "GET",
		url: "positions"
	})
	.then(
		function(response){
			cc.positions = response.data;
		}
	)
	
	cc.submit = function(){
		$http({
			method: "POST",
			url: "create/player",
			data: {
				  fname: cc.playerFirstName,
				  lname: cc.playerLastName,
				  coaches: cc.coach,
				  position: cc.position
			}
		});
		
		cc.addPlayer = 0;
	}
	
});


/*service persists through entire request, used to store data throughout 
 * multiple views or store functions that are repeatedly used
 */
angular.module("Rostar").service("service", function($http, $state){
	
});