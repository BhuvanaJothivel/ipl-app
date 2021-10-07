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
	<form action="http://localhost:8080/jspservlet-app-ipl/finals" method="post">
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
					<input type="radio" name="teamnames"  value="csk"><label>CSK</label>
					</div>
					<div>
					<input type="radio" name="teamnames"  value="srh"><label>SRH</label>
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
					<h2><%out.print(request.getAttribute("teamname"));%> TEAM DETAILS</h2>
					<p><%out.print(request.getAttribute("manofthematch"));%></p>
					<p><%out.print(request.getAttribute("nooffours"));%></p>
					<p><%out.print(request.getAttribute("noofsixes"));%></p>
				</div>
			</div>
		</div>
		</form>
		<script>
	document.getElementById('guess').addEventListener('click',()=>{
		document.getElementById('result').style.visibility = "visible";
	})
	document.getElementById('teamcsk').addEventListener('click',()=>{
		document.getElementById('team-details').style.visibility = "visible";
		document.getElementById('teamplayer-details').style.visibility = "visible";
	})
	document.getElementById('teamsrh').addEventListener('click',()=>{
		document.getElementById('team-details').style.visibility = "visible";
		document.getElementById('teamplayer-details').style.visibility = "visible";
	})
	</script>
	</body>
	
</html>