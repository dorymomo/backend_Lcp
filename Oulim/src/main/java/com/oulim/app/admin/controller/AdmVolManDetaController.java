package com.oulim.app.admin.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oulim.app.admin.dao.AdmVolunDetaDAO;
import com.oulim.app.common.controller.Execute;
import com.oulim.app.common.controller.Result;
import com.oulim.app.volunteer.dto.VolunActivityDTO;
import com.oulim.app.volunteer.dto.VolunApplyDTO;

public class AdmVolManDetaController implements Execute {

    @Override
    public Result execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Result result = new Result();
        AdmVolunDetaDAO dao = new AdmVolunDetaDAO();

        // =========================
        // 1. 봉사번호 기본값 처리 (
        // =========================
        int volunActNo = 4; // 기본값

        try {
            String param = request.getParameter("volunActNo");
            if (param != null && !param.trim().isEmpty()) {
                volunActNo = Integer.parseInt(param);
            }
        } catch (Exception e) {
            System.out.println("❌ volunActNo 파싱 실패 → 기본값 4 사용");
        }

        System.out.println("volunActNo: " + volunActNo);

        // =========================
        // 2. 봉사 상세 조회
        // =========================
        VolunActivityDTO detail = dao.selectVolunDetail(volunActNo);
        System.out.println("detail: " + detail);

        // =========================
        // 3. 신청 인원 수
        // =========================
        int applyCount = dao.selectApplyCount(volunActNo);
        System.out.println("applyCount: " + applyCount);

        // =========================
        // 4. 페이징 처리
        // =========================
        int page = 1;
        int rowCount = 10;

        try {
            String pageParam = request.getParameter("page");
            if (pageParam != null) {
                page = Integer.parseInt(pageParam);
            }
        } catch (Exception e) {
            System.out.println("❌ page 파싱 실패 → 기본값 1 사용");
        }

        int startRow = (page - 1) * rowCount + 1;
        int endRow = page * rowCount;

        System.out.println("page: " + page);
        System.out.println("startRow: " + startRow + ", endRow: " + endRow);

        // =========================
        // 5. 신청자 리스트 조회
        // =========================
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("volunActNo", volunActNo);
        paramMap.put("startRow", startRow);
        paramMap.put("endRow", endRow);

        List<VolunApplyDTO> list = dao.selectApplyUserList(paramMap);

        System.out.println("list size: " + (list != null ? list.size() : "null"));

        // =========================
        // 6. request 세팅
        // =========================
        request.setAttribute("detail", detail);
        request.setAttribute("applyCount", applyCount);
        request.setAttribute("volunList", list);
        request.setAttribute("page", page);

        // =========================
        // 7. 이동
        // =========================
        result.setPath("/app/admin/jsp/volunteer-manage/volun-detail.jsp");
        result.setRedirect(false);

        return result;
    }
}