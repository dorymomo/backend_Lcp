package com.oulim.app.volunteer.management.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.volunteer.dao.VolunteerMangementDAO;
import com.oulim.app.volunteer.dto.VolunActivityDTO;

public class VolunManageUpdateOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VolunteerMangementDAO volunteerMangementDAO = new VolunteerMangementDAO();
		VolunActivityDTO volunActivityDTO = new VolunActivityDTO();
		Result result = new Result();

		try {
			volunActivityDTO.setVolunActNo(parseInt(request.getParameter("volunActNo")));
			volunActivityDTO.setVolunActTitle(request.getParameter("volunActTitle"));
			volunActivityDTO.setVolunActRecruBegin(request.getParameter("volunActRecruBegin"));
			volunActivityDTO.setVolunActRecruEnd(request.getParameter("volunActRecruEnd"));
			volunActivityDTO.setVolunActProcBegin(request.getParameter("volunActProcBegin"));
			volunActivityDTO.setVolunActProcEnd(request.getParameter("volunActProcEnd"));
			volunActivityDTO.setVolunActPoint(parseInt(request.getParameter("volunActPoint")));
			volunActivityDTO.setVolunActBeginTime(parseInt(request.getParameter("volunActBeginTime")));
			volunActivityDTO.setVolunActEndTime(parseInt(request.getParameter("volunActEndTime")));
			volunActivityDTO.setVolunActActType(parseInt(request.getParameter("volunActActType")));
			volunActivityDTO.setVolunActAgeGroup(parseInt(request.getParameter("volunActAgeGroup")));
			volunActivityDTO.setVolunActAddress(request.getParameter("volunActAddress"));
			volunActivityDTO.setVolunActAddressDetail(request.getParameter("volunActAddressDetail"));
			volunActivityDTO.setVolunActPostnum(request.getParameter("volunActPostnum"));
			volunActivityDTO.setVolunActRecruMaxCount(parseInt(request.getParameter("volunActRecruMaxCount")));
			volunActivityDTO.setVolunActDetail(request.getParameter("volunActDetail"));

			volunteerMangementDAO.volManageUpdate(volunActivityDTO);

			result.setRedirect(true);
			result.setPath(request.getContextPath() + "/volunteer-manage/detail.vm?volunActNo="
					+ volunActivityDTO.getVolunActNo());
			
			System.out.println(volunActivityDTO);
		} catch (Exception e) {
			e.printStackTrace();

			result.setRedirect(true);
			result.setPath(request.getContextPath() + "/volunteer-manage/edit.vm?volunActNo="
					+ request.getParameter("volunActNo"));
		}

		return result;
	}

	private int parseInt(String value) {
		if (value == null || value.trim().isEmpty()) {
			return 0;
		}
		return Integer.parseInt(value.trim());
	}

}
