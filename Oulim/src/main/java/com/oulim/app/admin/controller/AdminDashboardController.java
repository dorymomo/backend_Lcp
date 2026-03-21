package com.oulim.app.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

public class AdminDashboardController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Result result = new Result();
		System.out.println("대쉬보드 진입요청");
		result.setPath("/app/admin/jsp/dashboard/dashboard.jsp");
		result.setRedirect(true);
		
		return result;
	}
	
	

}
