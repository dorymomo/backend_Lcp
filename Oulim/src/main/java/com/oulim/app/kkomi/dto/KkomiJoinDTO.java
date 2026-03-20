package com.oulim.app.kkomi.dto;

public class KkomiJoinDTO {
	private int userNo;
	private int kkomiNo;
	private int kkomiLev;
	private int kkomiExp;
	private int point;
	private int myRanking;
	private int needExp; // db에 저장되지 않는 값
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getkkomiNo() {
		return kkomiNo;
	}
	public void setkkomiNo(int kkomiNo) {
		this.kkomiNo = kkomiNo;
	}
	public int getKkomiLev() {
		return kkomiLev;
	}
	public void setKkomiLev(int kkomiLev) {
		this.kkomiLev = kkomiLev;
	}
	public int getKkomiExp() {
		return kkomiExp;
	}
	public void setKkomiExp(int kkomiExp) {
		this.kkomiExp = kkomiExp;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getMyRanking() {
		return myRanking;
	}
	public void setMyRanking(int myRanking) {
		this.myRanking = myRanking;
	}
		
	public int getNeedExp() {
		return needExp;
	}
	public void setNeedExp(int needExp) {
		this.needExp = needExp;
	}
	@Override
	public String toString() {
		return "KkomiJoinDTO [userNo=" + userNo + ", kkomiNo=" + kkomiNo + ", kkomiLev=" + kkomiLev + ", kkomiExp="
				+ kkomiExp + ", point=" + point + ", myRanking=" + myRanking + ", needExp=" + needExp + "]";
	}

	
}
