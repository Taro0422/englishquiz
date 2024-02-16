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
			String quizId = request.getParameter("quizId");
			String userChoice = request.getParameter("choice");
			String question = request.getParameter("question");
			String answerChoice = request.getParameter("answer");
			int correctNumber = (int) session.getAttribute("correctNumber");
			
			if(userChoice .equals(answerChoice)) {
				correctNumber++;
				session.setAttribute("correctNumber",correctNumber);
			}else {
				QuizResultLogic quizresultlogic = new QuizResultLogic();
				Account userId = (Account)session.getAttribute("userId");
				Quiz quizId2 = (Quiz)session.getAttribute("quizId");
				quizresultlogic.execute(userId,quizId2);
			}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/quizAnswer.jsp");
		dispatcher.forward(request, response);
		
	}


}
