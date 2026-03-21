package com.oulim.app.admin.dto;

public class AdminMemPointDTO {

    private int userNo;          // 회원번호
    private int totalAmount;     // 현재 보유 포인트
    private int changeAmount;    // 지급/차감할 포인트
    private String logReason;    // 지급/차감 사유
	
    
    
    
    public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int getChangeAmount() {
		return changeAmount;
	}
	public void setChangeAmount(int changeAmount) {
		this.changeAmount = changeAmount;
	}
	public String getLogReason() {
		return logReason;
	}
	public void setLogReason(String logReason) {
		this.logReason = logReason;
	}
	
	
	
	@Override
	public String toString() {
		return "AdminMemPointDTO [userNo=" + userNo + ", totalAmount=" + totalAmount + ", changeAmount=" + changeAmount
				+ ", logReason=" + logReason + "]";
	}


}