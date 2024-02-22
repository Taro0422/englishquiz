package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.Quiz;
import model.QuizResultLogic;

/**
 * Servlet implementation class MatchingAnswer
 */
@WebServlet("/MatchingAnswer")
public class MatchingAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatchingAnswer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			HttpSession session = request.getSession();
			String userChoice = request.getParameter("choice");
			String answerChoice = request.getParameter("answer");
			String quiz_Id = request.getParameter("quiz_Id");
			int correctNumber = (int) session.getAttribute("correctNumber");
			
			if(userChoice .equals(answerChoice)) {
				correctNumber++;
				session.setAttribute("correctNumber",correctNumber);
			}else {
				QuizResultLogic quizresultlogic = new QuizResultLogic();
				Account userId = new Account((String) session.getAttribute("userId"));
				Quiz quiz_ID = new Quiz(Integer.parseInt(quiz_Id));
				quizresultlogic.execute(userId,quiz_ID);
			}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/quizAnswer.jsp");
		dispatcher.forward(request, response);
		
	}


}
