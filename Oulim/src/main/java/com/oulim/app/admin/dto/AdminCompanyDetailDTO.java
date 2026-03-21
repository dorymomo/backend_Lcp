package com.oulim.app.admin.dto;

import java.sql.Date;
import java.time.LocalDate;

public class AdminCompanyDetailDTO {

//	기관명
//	이름
//	생년월일
//	사업자등록번호
//	이메일
//	주소
//	재직증명서(파일)다운
//	사업자등록증(파일)다운
//	===
//	승인반려버튼
	
//	  Organ_Name VARCHAR2(50) NOT NULL,
//	  User_Name VARCHAR2(20) NOT NULL,
//	  User_Birth DATE NOT NULL,
//	  Organ_Cert_No NUMBER
//	  User_Email VARCHAR2(50) NOT NULL UNIQUE,
//	  User_Address VARCHAR2(50),
//	  User_No NUMBER NOT NULL,
//	  Organ_No NUMBER,
//	  Organ_File_System_Name VARCHAR2(300) NOT NULL,
//	  Organ_File_Original_Name VARCHAR2(300) NOT NULL,
//	

		
	    private int userNo;                      // 회원번호
	    private int organNo;                     // 기관번호

	    private String organName;                // 기관명
	    private String userName;                 // 이름
	    private Date userBirth;                  // 생년월일
	    private String organCertNum;             // 사업자 등록번호
	    private String userEmail;                // 이메일
	    private String userAddress;              // 주소
	    private String userAddressDetail;        // 상세주소

	    // 현재 스키마 기준 파일 1세트
	    private String organFileSystemName;      // 서버 저장 파일명
	    private String organFileOriginalName;    // 원본 파일명

	    public int getUserNo() {
	        return userNo;
	    }

	    public void setUserNo(int userNo) {
	        this.userNo = userNo;
	    }

	    public int getOrganNo() {
	        return organNo;
	    }

	    public void setOrganNo(int organNo) {
	        this.organNo = organNo;
	    }

	    public String getOrganName() {
	        return organName;
	    }

	    public void setOrganName(String organName) {
	        this.organName = organName;
	    }

	    public String getUserName() {
	        return userName;
	    }

	    public void setUserName(String userName) {
	        this.userName = userName;
	    }

	    public Date getUserBirth() {
	        return userBirth;
	    }

	    public void setUserBirth(Date userBirth) {
	        this.userBirth = userBirth;
	    }

	    public String getOrganCertNum() {
	        return organCertNum;
	    }

	    public void setOrganCertNum(String organCertNum) {
	        this.organCertNum = organCertNum;
	    }

	    public String getUserEmail() {
	        return userEmail;
	    }

	    public void setUserEmail(String userEmail) {
	        this.userEmail = userEmail;
	    }

	    public String getUserAddress() {
	        return userAddress;
	    }

	    public void setUserAddress(String userAddress) {
	        this.userAddress = userAddress;
	    }

	    public String getUserAddressDetail() {
	        return userAddressDetail;
	    }

	    public void setUserAddressDetail(String userAddressDetail) {
	        this.userAddressDetail = userAddressDetail;
	    }

	    public String getOrganFileSystemName() {
	        return organFileSystemName;
	    }

	    public void setOrganFileSystemName(String organFileSystemName) {
	        this.organFileSystemName = organFileSystemName;
	    }

	    public String getOrganFileOriginalName() {
	        return organFileOriginalName;
	    }

	    public void setOrganFileOriginalName(String organFileOriginalName) {
	        this.organFileOriginalName = organFileOriginalName;
	    }

	    @Override
	    public String toString() {
	        return "AdminCompanyDetailDTO [userNo=" + userNo + ", organNo=" + organNo + ", organName=" + organName
	                + ", userName=" + userName + ", userBirth=" + userBirth + ", organCertNum=" + organCertNum
	                + ", userEmail=" + userEmail + ", userAddress=" + userAddress
	                + ", userAddressDetail=" + userAddressDetail
	                + ", organFileSystemName=" + organFileSystemName
	                + ", organFileOriginalName=" + organFileOriginalName + "]";
	    }
	}