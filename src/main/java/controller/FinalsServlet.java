package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TeamDetails;

@WebServlet(urlPatterns = { "/jspservlet-app-ipl/finals" })
public class FinalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FinalsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("finals.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String guess = request.getParameter("guess");
		String team1 = request.getParameter("teamcsk");
		String team2 = request.getParameter("teamsrh");
		String option = request.getParameter("teamnames");
		
		String winner = "CSK";
		
		TeamDetails q1 = new TeamDetails();
		
		if(guess!=null) {
			if(option == winner) {
				request.setAttribute("winner", "Your guess is right. CSK won their Qualifier-1 match");
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("finals.jsp");
				dispatcher.forward(request, response);
			}
			if(option != winner) {
				request.setAttribute("winner", "Your guess is Wrong. SRH lost their Qualifier-1 match");
				RequestDispatcher dispatcher = request.getRequestDispatcher("finals.jsp");
				dispatcher.forward(request, response);
			}
		}
		
		if(team1!=null) {
			q1.setTeamName("CSK");
			q1.setScore(181);
			q1.setTopScorer("Shane Watson");
			q1.setNoOfFours(16);
			q1.setNoOfSixes(10);
			request.setAttribute("teamname", q1.getTeamName());
			request.setAttribute("score", q1.getScore());
			request.setAttribute("topscorer", q1.getTopScorer());
			request.setAttribute("nooffours", q1.getNoOfFours());
			request.setAttribute("noofsixes", q1.getNoOfSixes());
			RequestDispatcher dispatcher = request.getRequestDispatcher("finals.jsp");
			dispatcher.forward(request, response);
		}
		
		if(team2!=null) {
			q1.setTeamName("SRH");
			q1.setScore(178);
			q1.setTopScorer("Shreevats Goswami");
			q1.setNoOfFours(13);
			q1.setNoOfSixes(10);
			request.setAttribute("teamname", q1.getTeamName());
			request.setAttribute("score", q1.getScore());
			request.setAttribute("topscorer", q1.getTopScorer());
			request.setAttribute("nooffours", q1.getNoOfFours());
			request.setAttribute("noofsixes", q1.getNoOfSixes());
			RequestDispatcher dispatcher = request.getRequestDispatcher("finals.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
