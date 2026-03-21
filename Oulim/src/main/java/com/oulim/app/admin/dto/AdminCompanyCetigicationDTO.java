package com.oulim.app.admin.dto;

import java.sql.Date;

public class AdminCompanyCetigicationDTO {
//	유저번호
//	회사명
//	아이디
//	가입일
//	회사코드
//	====
//	체크박스
//	페이지네이션
//	승인반려버튼
//	UserNo NUMBER
//	OrganName VARCHAR2
//	UserID varchar2
//	
//	  Organ_No NUMBER
	

   
    private int userNo;              // 유저번호
    private String organName;        // 회사명
    private String userId;           // 아이디
    private Date userJoinDate;       // 가입일
    private String organCertNum;     // 회사코드(사업자등록번호/기관인증번호)

    private int startRow;
    private int endRow;

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getUserJoinDate() {
        return userJoinDate;
    }

    public void setUserJoinDate(Date userJoinDate) {
        this.userJoinDate = userJoinDate;
    }

    public String getOrganCertNum() {
        return organCertNum;
    }

    public void setOrganCertNum(String organCertNum) {
        this.organCertNum = organCertNum;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    @Override
    public String toString() {
        return "AdminCompanyListDTO [userNo=" + userNo + ", organName=" + organName + ", userId=" + userId
                + ", userJoinDate=" + userJoinDate + ", organCertNum=" + organCertNum
                + ", startRow=" + startRow + ", endRow=" + endRow + "]";
    }
	
}
