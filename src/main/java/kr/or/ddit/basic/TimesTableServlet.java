package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TimesTableServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//writer 객체를 통해 html문서를 생성해준다.
		PrintWriter writer = resp.getWriter();
		
		writer.println("<table border='1'>");
		for(int i = 1; i <= 9; i++) {
			writer.println("<tr>");
			
			for(int j = 2; j <= 9; j++) {
				writer.println("<td>" + j + " * " + i + " = " + i*j +"</td>");
			}
			writer.println("	</tr>");
		}
		writer.println("</table>");
	}		
}
