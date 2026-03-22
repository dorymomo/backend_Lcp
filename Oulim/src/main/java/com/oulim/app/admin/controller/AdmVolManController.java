package com.oulim.app.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.admin.dao.AdmVolMangDAO;
import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.volunteer.dto.VolunActivityDTO;

public class AdmVolManController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AdmVolMangDAO dao = new AdmVolMangDAO();
        VolunActivityDTO dto = new VolunActivityDTO();

        // =========================
        // 1. 파라미터 수집
        // =========================
        String recruitStatus = request.getParameter("recruitStatus");
        String keyword = request.getParameter("keyword");
        String searchType = request.getParameter("searchType");
        String begin = request.getParameter("volunActProcBegin");
        String end = request.getParameter("volunActProcEnd");

        // =========================
        // 2. DTO에 세팅 (DB 조회용)
        // =========================
        dto.setRecruitStatus(recruitStatus);
        dto.setKeyword(keyword);
        dto.setSearchType(searchType);
        dto.setVolunActProcBegin(begin);
        dto.setVolunActProcEnd(end);

        // 페이징 (임시)
        dto.setStartRow(1);
        dto.setEndRow(100);

        // =========================
        // 3. DB 조회
        // =========================
        List<VolunActivityDTO> list = dao.selectAdminVolunList(dto);
        System.out.println("리스트 개수: " + list.size());

        // =========================
        // 4. JSP로 데이터 전달 (검색 유지용)
        // =========================
        request.setAttribute("volunList", list);

        // 검색 유지
        request.setAttribute("keyword", keyword);
        request.setAttribute("searchType", searchType);
        request.setAttribute("recruitStatus", recruitStatus);
        request.setAttribute("volunActProcBegin", begin);
        request.setAttribute("volunActProcEnd", end);

        // =========================
        // 5. 페이지 이동 (forward)
        // =========================
        Result result = new Result();
        result.setPath("/app/admin/jsp/volunteer-manage/volun-list.jsp");

        result.setRedirect(false);

        return result;
    }
}