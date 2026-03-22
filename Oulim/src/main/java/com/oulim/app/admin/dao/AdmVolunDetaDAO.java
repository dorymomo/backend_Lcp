package com.oulim.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.config.MyBatisConfig;
import com.oulim.app.volunteer.dto.VolunActivityDTO;
import com.oulim.app.volunteer.dto.VolunApplyDTO;

public class AdmVolunDetaDAO {

    private SqlSession sqlSession;

    public AdmVolunDetaDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }

    /**
     * 봉사 상세 조회 (상단 카드)
     */
    public VolunActivityDTO selectVolunDetail(int volunActNo) {
        return sqlSession.selectOne("AdmVolManDeta.selectVolunDetail", volunActNo);
    }

    /**
     * 신청 인원 수 조회
     */
    public int selectApplyCount(int volunActNo) {
        return sqlSession.selectOne("AdmVolManDeta.selectApplyCount", volunActNo);
    }

    /**
     * 신청자 리스트 조회 (페이징)
     */
    public List<VolunApplyDTO> selectApplyUserList(Map<String, Object> paramMap) {
        return sqlSession.selectList("AdmVolManDeta.selectApplyUserList", paramMap);
    }

    /**
     * 신청자 삭제
     */
    public void deleteApply(int volunActNo, int userNo) {
        Map<String, Integer> paramMap = Map.of(
            "volunActNo", volunActNo,
            "userNo", userNo
        );
        sqlSession.delete("VolunteerManagement.deleteApply", paramMap);
    }
}