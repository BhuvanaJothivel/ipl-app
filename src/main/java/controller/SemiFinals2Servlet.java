package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TeamDetails;

@WebServlet(urlPatterns = { "/jspservlet-app-ipl/qualifier2" })
public class SemiFinals2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SemiFinals2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("semifinals2.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String guess = request.getParameter("guess");
		String team1 = request.getParameter("teamcsk");
		String team2 = request.getParameter("teamsrh");
		String option = request.getParameter("teamnames");
		
		String winner = "SRH";
		
		TeamDetails q2 = new TeamDetails();
		
		if(guess!=null) {
			if(option == winner) {
				request.setAttribute("winner", "Your guess is right. SRH won their Qualifier-1 match");
				RequestDispatcher dispatcher = request.getRequestDispatcher("semifinals2.jsp");
				dispatcher.forward(request, response);
			}
			if(option != winner) {
				request.setAttribute("winner", "Your guess is Wrong. KKR lost their Qualifier-1 match");
				RequestDispatcher dispatcher = request.getRequestDispatcher("semifinals2.jsp");
				dispatcher.forward(request, response);
			}
		}
		
		if(team1!=null) {
			q2.setTeamName("SRH");
			q2.setScore(174);
			q2.setTopScorer("Wriddhiman Saha");
			q2.setNoOfFours(12);
			q2.setNoOfSixes(7);
			request.setAttribute("teamname", q2.getTeamName());
			request.setAttribute("score", q2.getScore());
			request.setAttribute("topscorer", q2.getTopScorer());
			request.setAttribute("nooffours", q2.getNoOfFours());
			request.setAttribute("noofsixes", q2.getNoOfSixes());
			RequestDispatcher dispatcher = request.getRequestDispatcher("semifinals2.jsp");
			dispatcher.forward(request, response);
		}
		
		if(team2!=null) {
			q2.setTeamName("KKR");
			q2.setScore(160);
			q2.setTopScorer("Chris Lynn");
			q2.setNoOfFours(15);
			q2.setNoOfSixes(5);
			request.setAttribute("teamname", q2.getTeamName());
			request.setAttribute("score", q2.getScore());
			request.setAttribute("topscorer", q2.getTopScorer());
			request.setAttribute("nooffours", q2.getNoOfFours());
			request.setAttribute("noofsixes", q2.getNoOfSixes());
			RequestDispatcher dispatcher = request.getRequestDispatcher("semifinals2.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
