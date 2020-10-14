package kr.or.ddit.jobs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.jobs.model.JobsVo;
import kr.or.ddit.jobs.service.JobsService;
import kr.or.ddit.jobs.service.JobsServiceI;

/**
 * Servlet implementation class JobsListServlet
 */
@WebServlet("/jobsList")
public class JobsListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final Logger logger = LoggerFactory.getLogger(JobsListServlet.class);

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JobsServiceI jobsServise = new JobsService();
		List<JobsVo> jobsList = jobsServise.getAllJobs();
		logger.debug("jobsList: {} ", jobsList);
		request.setAttribute("jobsList", jobsList);
		request.getRequestDispatcher("/jobs/jobsList.jsp").forward(request, response);
	}

}
