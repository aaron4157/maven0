package idv.aaron4157.message;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Msg extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//使用index.jsp向使用者打招呼
		String received = (String) req.getAttribute("name");
		resp.getWriter().append(received.toLowerCase());
		RequestDispatcher disp = req.getRequestDispatcher("index.jsp");
		disp.forward(req, resp);

	}

	public Msg() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
