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

import model.Account;
import model.DeleteLogic;
import model.Remember;
import model.RememberListCreateLogic;

/**
 * Servlet implementation class RememberListServlet
 */
@WebServlet("/RememberListServlet")
public class RememberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RememberListServlet() {
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
		String action = request.getParameter("action");
		if(action.equals("delete")) {
			String userId = request.getParameter("userId");
			String quiz_Id = request.getParameter("quiz_Id");
			DeleteLogic deleteLogic = new DeleteLogic();
			deleteLogic.execute(userId,Integer.parseInt(quiz_Id));
		}else {}
			HttpSession session = request.getSession();
			Account userId = new Account((String) session.getAttribute("userId"));
			RememberListCreateLogic rememberListCreateLogic = new RememberListCreateLogic();
			List<Remember>rememberList =rememberListCreateLogic.execute(userId);
			request.setAttribute("rememberList",rememberList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/rememberList.jsp");
		dispatcher.forward(request, response);
		
	}

}
