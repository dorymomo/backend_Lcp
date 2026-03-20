package com.oulim.app.volunteer.management.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.volunteer.dao.VolunteerMangementDAO;
import com.oulim.app.volunteer.dto.VolunActivityDTO;
import com.oulim.app.volunteer.dto.VolunApplyDTO;

public class VolunManageDetailController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VolunteerMangementDAO volunteerMangementDAO = new VolunteerMangementDAO();
		Result result = new Result();
		
		int volunActNo = Integer.parseInt(request.getParameter("volunActNo"));

		String pageParam = request.getParameter("page");
		int page = 1;

		if (pageParam != null && !pageParam.equals("")) {
			page = Integer.parseInt(pageParam);
		}
		
		String view = request.getParameter("view");
		if (view == null || view.trim().equals("")) {
			view = "detail";
		}

		int rowCount = 10;
		int endRow = page * rowCount;
		int startRow = endRow - (rowCount - 1);

		int totalCount = volunteerMangementDAO.selectApplyCount(volunActNo);
		int lastPage = (totalCount + rowCount - 1) / rowCount;

		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("volunActNo", volunActNo);
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);

		VolunActivityDTO volunDetail = volunteerMangementDAO.selectVolManageDetail(volunActNo);
		List<VolunApplyDTO> applyList = volunteerMangementDAO.applyVolSelectPage(pageMap);
		List<VolunApplyDTO> applyCountList = volunteerMangementDAO.selectApplyCountByDate(volunActNo);
		
		//출석,결석 버튼 활성화
		boolean canAttendance = false;
		try {
			LocalDate today = LocalDate.now();
			LocalDate procEnd = LocalDate.parse(volunDetail.getVolunActProcEnd());
			canAttendance = today.isAfter(procEnd); // 종료 다음날부터 가능
		} catch (Exception e) {
			canAttendance = false;
		}
		
		request.setAttribute("applyCountList", applyCountList);
		request.setAttribute("volunDetail", volunDetail);
		request.setAttribute("applyList", applyList);
		request.setAttribute("canAttendance", canAttendance);
		
		request.setAttribute("page", page);
		request.setAttribute("rowCount", rowCount);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("view", view);

		result.setPath("/app/volunteer-management/volunteer-manage-detail.jsp");
		result.setRedirect(false);

		return result;
	}

}
