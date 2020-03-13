package com.bbs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbs.service.ManageService;

@WebServlet("/delete_plate")
public class DeletePlate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ManageService manageService=new ManageService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		//获取请求的参数
		Integer plateId=Integer.valueOf(request.getParameter("plateId"));
		manageService.deleteplateId(plateId);
		request.getRequestDispatcher("plate_manage.jsp").forward(request, response);
		return;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
