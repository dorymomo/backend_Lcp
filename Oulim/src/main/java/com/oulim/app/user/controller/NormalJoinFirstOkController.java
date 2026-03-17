package com.oulim.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;

public class NormalJoinFirstOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Result result = new Result();

		request.setAttribute("userName", request.getParameter("userName"));
		request.setAttribute("userBirth", request.getParameter("userBirth"));
		request.setAttribute("userEmail", request.getParameter("userEmail"));
		request.setAttribute("userPhoneNum", request.getParameter("userPhoneNum"));

		result.setPath("/app/user/signin/signup-info.jsp");
		result.setRedirect(false);

		return result;
	}

}
