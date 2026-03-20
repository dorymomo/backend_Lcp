package com.oulim.app.kkomi.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.common.util.DefineType;
import com.oulim.app.kkomi.service.KkomiService;

public class KkomiUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Result result = new Result();
		
		if(request.getSession().getAttribute("userNo") == null) {
			result.setPath(request.getContextPath() + "/app/user/login/login.jsp");
			result.setRedirect(true);
			return result;
		}
		
		KkomiService kkoServ = new KkomiService();
		int userNo = (int)request.getSession().getAttribute("userNo");
		int updateResult = kkoServ.kkomiExpUp(userNo);
		
		// 수행 결과 json 반환
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		String resultString = "";
		switch(updateResult) {
		case DefineType.SUCCESS -> {
			resultString = "도력 쌓기 성공!!";
		}
		case DefineType.DB_PROBLEM ->{
			resultString = "도력 쌓기 실패";			
		}
		case DefineType.LACK_OF_CURRENCY ->{
			resultString = "보유한 재화가 부족합니다.";
		}
		default ->	resultString = "알 수 없는 오류입니다.";
		}
		
		try(PrintWriter out = response.getWriter()){
			out.print("{\"result\":" + updateResult + ",\"data\":\"" + resultString + "\"}");
			out.flush();
		}
		result.setPath(null);
		result.setRedirect(false);
		return result;
	}

}
