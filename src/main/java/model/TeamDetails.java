package model;

public class TeamDetails {
	private String teamName;
	private int score;
	private String topScorer;
	private int noOfFours;
	private int noOfSixes;
	
	
	public String getTopScorer() {
		return topScorer;
	}
	public void setTopScorer(String topScorer) {
		this.topScorer = topScorer;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNoOfFours() {
		return noOfFours;
	}
	public void setNoOfFours(int noOfFours) {
		this.noOfFours = noOfFours;
	}
	public int getNoOfSixes() {
		return noOfSixes;
	}
	public void setNoOfSixes(int noOfSixes) {
		this.noOfSixes = noOfSixes;
	}
	
}
