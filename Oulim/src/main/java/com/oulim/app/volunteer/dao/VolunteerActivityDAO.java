package com.oulim.app.volunteer.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.oulim.app.volunteer.dto.VolunteerActivityDTO;

public class VolunteerActivityDAO {

    private SqlSession sqlSession;

    public VolunteerActivityDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<VolunteerActivityDTO> selectVolunteerList(){

        return sqlSession.selectList("VolunteerMapper.selectVolunteerList");

    }

}