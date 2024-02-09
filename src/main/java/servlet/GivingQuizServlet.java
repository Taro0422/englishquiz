package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GivingQuizListLogic;
import model.Quiz;

/**
 * Servlet implementation class GivingQuizServlet
 */
@WebServlet("/GivingQuizServlet")
public class GivingQuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GivingQuizServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int quizNumber = (int) session.getAttribute("quizNumber");
		if(quizNumber< 9) {
			String action = request.getParameter("action");
			if(action.equals("2")) {
				quizNumber++;
				session.setAttribute("quizNumber",quizNumber);
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/quiz.jsp");
				dispatcher.forward(request, response);
			}
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher.forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GivingQuizListLogic givingQuizListLogic = new GivingQuizListLogic();
		List<Quiz>quizList = givingQuizListLogic.execute();
		HttpSession session = request.getSession();
		session.setAttribute("quizList",quizList);
		int quizNumber = 0;
		session.setAttribute("quizNumber",quizNumber);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/quiz.jsp");
		dispatcher.forward(request, response);
	}

}
