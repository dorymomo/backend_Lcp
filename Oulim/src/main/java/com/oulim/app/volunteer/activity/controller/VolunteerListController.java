package com.oulim.app.volunteer.activity.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.oulim.app.volunteer.dao.VolunteerActivityDAO;
import com.oulim.app.volunteer.dto.VolunActivityDTO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/volunteer/list")
public class VolunteerListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // DAO 생성
    	VolunteerActivityDAO volunteerDAO = new VolunteerActivityDAO();

        // 검색 파라미터 받기
        String actType = req.getParameter("actType");
        String ageGroup = req.getParameter("ageGroup");
        String recruitStatus = req.getParameter("recruitStatus");
        String volunDate = req.getParameter("volunDate");
        String searchType = req.getParameter("searchType");
        String keyword = req.getParameter("keyword");

        // Mapper로 전달할 파라미터 Map 생성
        Map<String, Object> param = new HashMap<>();

        param.put("actType", actType);
        param.put("ageGroup", ageGroup);
        param.put("recruitStatus", recruitStatus);
        param.put("volunDate", volunDate);
        param.put("searchType", searchType);
        param.put("keyword", keyword);

        // 봉사활동 목록 조회
        List<VolunActivityDTO> list = volunteerDAO.selectVolunteerList(param);

        // JSP로 데이터 전달
        req.setAttribute("volunteerList", list);

        // 봉사 목록 화면으로 이동
        req.getRequestDispatcher("/volunteer/list.jsp")
           .forward(req, resp);
    }
}