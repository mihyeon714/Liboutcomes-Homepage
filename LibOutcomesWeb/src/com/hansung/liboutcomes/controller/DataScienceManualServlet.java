package com.hansung.liboutcomes.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hansung.liboutcomes.model.ManualService;

@WebServlet("/DataScienceManual")
public class DataScienceManualServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ManualService manualService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		manualService = new ManualService();
		
		ResultSet rs = manualService.getManualList();
		
		req.setAttribute("manual_list", rs);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/page/dataScienceManual.jsp");
		dispatcher.forward(req, resp);
	}

}
