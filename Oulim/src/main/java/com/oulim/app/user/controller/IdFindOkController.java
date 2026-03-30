package com.oulim.app.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.user.dao.UserDAO;
import com.oulim.app.user.dto.UserDTO;

public class IdFindOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		Result result = new Result();
		HttpSession session = request.getSession();

		String userName = request.getParameter("userName");
		String userBirth = request.getParameter("userBirth");
		String userEmail = request.getParameter("userEmail");

		Boolean verified = (Boolean) session.getAttribute("emailVerified");

		if (userName == null || userName.trim().isEmpty()) {
			request.setAttribute("error", "이름을 입력해주세요.");
			result.setPath("/app/user/find-idpassword/id-find.jsp");
			result.setRedirect(false);
			return result;
		}

		if (userBirth == null || userBirth.trim().isEmpty()) {
			request.setAttribute("error", "생년월일을 입력해주세요.");
			result.setPath("/app/user/find-idpassword/id-find.jsp");
			result.setRedirect(false);
			return result;
		}

		if (userEmail == null || userEmail.trim().isEmpty()) {
			request.setAttribute("error", "이메일을 입력해주세요.");
			result.setPath("/app/user/find-idpassword/id-find.jsp");
			result.setRedirect(false);
			return result;
		}

		if (verified == null || !verified) {
			request.setAttribute("error", "이메일 인증을 완료해주세요.");
			result.setPath("/app/user/find-idpassword/id-find.jsp");
			result.setRedirect(false);
			return result;
		}

		userDTO.setUserName(userName);
		userDTO.setUserBirth(userBirth);
		userDTO.setUserEmail(userEmail);

		String userId = userDAO.findId(userDTO);

		if (userId != null) {
			request.setAttribute("userId", userId);
			result.setPath("/app/user/find-idpassword/id-find-view.jsp");
		} else {
			request.setAttribute("error", "일치하는 회원정보가 없습니다.");
			result.setPath("/app/user/find-idpassword/id-find.jsp");
		}

		session.removeAttribute("emailVerified");

		result.setRedirect(false);
		return result;
	}
}