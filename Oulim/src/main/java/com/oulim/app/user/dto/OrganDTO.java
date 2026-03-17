package com.oulim.app.user.dto;

public class OrganDTO {
	
	private int organNo;
	private String organName;
	private String organCertNum;
	
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
	public String getOrganCertNum() {
		return organCertNum;
	}
	public void setOrganCertNum(String organCertNum) {
		this.organCertNum = organCertNum;
	}
	@Override
	public String toString() {
		return "OrganDTO [organNo=" + organNo + ", organName=" + organName + ", organCertNum=" + organCertNum + "]";
	}
	
	
	
	
}
