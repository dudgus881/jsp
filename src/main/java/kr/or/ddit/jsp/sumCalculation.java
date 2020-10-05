package kr.or.ddit.jsp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class sumCalculation
 */
@WebServlet("/sumCalculation")
public class sumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = LoggerFactory.getLogger(sumCalculation.class);
    
	//입력 요청 처리(sumInput.jsp)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("sumCalculation.doPost");
		
		//parameter, attribute
		int start = Integer.parseInt( request.getParameter("start")); //혼동하지말자
		int end = Integer.parseInt(request.getParameter("end"));
		
		int sumResult = 0;
		
		for (int i = start; i <= end; i++) {
			sumResult += 1;
		}
		
		request.setAttribute("sumResult", sumResult);
		//1,5 ==> 15
		logger.debug("sumResult : {} " , sumResult);
		
		request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);
	}

}
