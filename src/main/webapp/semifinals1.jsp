<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>IPL</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<link rel="stylesheet" href="http://localhost:8080/jspservlet-app-ipl/assets/matchstyle.css" /> 
	</head>
	<body>
	<form action="http://localhost:8080/jspservlet-app-ipl/qualifier1" method="post">
		<div>
			<img alt="" src="http://localhost:8080/jspservlet-app-ipl/assets/ipl.svg">
		</div>
		<div class="container">
			<h1>QUALIFIER 1</h1>
			<div class="images">
				<img alt="" src="http://localhost:8080/jspservlet-app-ipl/assets/csk.svg" id="team1">
				<img alt="" src="http://localhost:8080/jspservlet-app-ipl/assets/image1.svg" id="vs">
				<img alt="" src="http://localhost:8080/jspservlet-app-ipl/assets/srh.svg" id="team2">
			</div>
			<div class="inputs">
				<label>Guess which team is gonna win the match!</label><br><br>
				<div id="options">
					<div>
					<input type="radio" name="teamnames"  value="CSK"><label>CSK</label>
					</div>
					<div>
					<input type="radio" name="teamnames"  value="SRH"><label>SRH</label>
					</div>
					<button name="guess" id="guess">GUESS</button>
				</div>
			</div>
			<div class="result" id="result">
			<h3><%out.print(request.getAttribute("winner")); %></h3>
			<div class="buttons">
				<button name="team1button" id="teamcsk">VIEW CSK DETAILS</button>
				<button name="team2button" id="teamsrh">VIEW SRH DETAILS</button>
			</div>
			</div>	
			<div class="team-details" id="team-details">
				<div id="teamplayer-details">
					<h2><%out.print(request.getAttribute("teamname"));%> TEAM DETAILS</h2>${team.getTeamName()}
					<p><%out.print(request.getAttribute("score"));%></p>
					<p><%out.print(request.getAttribute("topscorer"));%></p>
					<p><%out.print(request.getAttribute("nooffours"));%></p>
					<p><%out.print(request.getAttribute("noofsixes"));%></p>
				</div>
			</div>
		</div>
		</form>
		<script>
	document.getElementById('guess').addEventListener('click',(e)=>{
		e.preventDefault();
		document.getElementById('result').style.display = "block";
	})
	document.getElementById('teamcsk').addEventListener('click',(e)=>{
		e.preventDefault();
		document.getElementById('team-details').style.display = "flex";
		document.getElementById('teamplayer-details').style.display = "block";
	})
	document.getElementById('teamsrh').addEventListener('click',(e)=>{
		e.preventDefault();
		document.getElementById('team-details').style.display = "flex";
		document.getElementById('teamplayer-details').style.display = "block";
	})
	</script>
	</body>
	
</html>