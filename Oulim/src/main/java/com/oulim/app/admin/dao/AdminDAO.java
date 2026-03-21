package com.oulim.app.admin.dao;

import org.apache.ibatis.session.SqlSession; 
import com.oulim.app.admin.dto.AdminDTO; 
import com.oulim.app.config.MyBatisConfig; 


public class AdminDAO {
    SqlSession sqlSession;
    
    public AdminDAO() {
        sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
    }
    
    //mybatis가 맵퍼로 보냄
    public int login(AdminDTO adminDTO) {
    	System.out.println("AdminDAO의 로그인 메소드 호출");
        return sqlSession.selectOne("admin.login", adminDTO );
    }
}