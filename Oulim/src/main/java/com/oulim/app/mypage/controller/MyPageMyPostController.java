package com.oulim.app.mypage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.mypage.dao.MyPageJoinDAO;
import com.oulim.app.mypage.dto.MyPageJoinDTO;

public class MyPageMyPostController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	    Result result = new Result();
	    MyPageJoinDAO mypageDAO = new MyPageJoinDAO();
	    HttpSession session = request.getSession();

	    Integer userNo = (Integer) session.getAttribute("userNo");

	    // 🔥 페이지 처리
	    String temp = request.getParameter("page");
	    int page = (temp == null) ? 1 : Integer.parseInt(temp);
	    if (page < 1) page = 1;

	    int rowCount = 10;
	    int pageCount = 10;

	    int startRow = (page - 1) * rowCount + 1;
	    int endRow = startRow + rowCount - 1;

	    Map<String, Object> pageMap = new HashMap<>();
	    pageMap.put("startRow", startRow);
	    pageMap.put("endRow", endRow);
	    pageMap.put("userNo", userNo);

	    System.out.println("작성글 조회 쿼리 실행 전");

	    List<MyPageJoinDTO> mypost = mypageDAO.viewMyPost(pageMap);

	    System.out.println("작성글 조회 쿼리 실행");

	    request.setAttribute("mypost", mypost);

	    int total = mypageDAO.getMyPostTotal(userNo);

	    int realEndPage = (int) Math.ceil(total / (double) rowCount);
	    int endPage = (int) (Math.ceil(page / (double) pageCount) * pageCount);
	    int startPage = endPage - (pageCount - 1);

	    endPage = Math.min(endPage, realEndPage);

	    boolean prev = startPage > 1;
	    boolean next = endPage < realEndPage;

	    request.setAttribute("page", page);
	    request.setAttribute("startPage", startPage);
	    request.setAttribute("endPage", endPage);
	    request.setAttribute("prev", prev);
	    request.setAttribute("next", next);

	    System.out.println("pageMap : " + pageMap);
	    System.out.println("mypost : " + mypost);

	    result.setPath("/app/mypage/community-history/myposts.jsp");
	    result.setRedirect(false);

	    return result;
	}

}
