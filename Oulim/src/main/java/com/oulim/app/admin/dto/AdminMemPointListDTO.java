package com.oulim.app.admin.dto;



public class AdminMemPointListDTO {

//	보유포인트
//	포인트지급차감이유(입력)
//	보유포인트(지급차감버튼)
//	포인트조회(리스트)
//	뒤로가기버튼
	
//	  Total_Amount NUMBER DEFAULT 0 NOT NULL,
//	  Change_AMOUNT NUMBER NOT NULL,
//	  Log_Reason VARCHAR2(50),
//	  Log_Date DATE NOT NULL,
	
		private int totalAmount;
		private int changeAmount;
		private String logReason;
/**
 * @return the totalAmount
 */
private int getTotalAmount() {
	return totalAmount;
}
/**
 * @param totalAmount the totalAmount to set
 */
private void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
/**
 * @return the changeAmount
 */
private int getChangeAmount() {
	return changeAmount;
}
/**
 * @param changeAmount the changeAmount to set
 */
private void setChangeAmount(int changeAmount) {
	this.changeAmount = changeAmount;
}
/**
 * @return the logReason
 */
private String getLogReason() {
	return logReason;
}
/**
 * @param logReason the logReason to set
 */
private void setLogReason(String logReason) {
	this.logReason = logReason;
}

@Override
public String toString() {
	return "AdminMemEditDTO [totalAmount=" + totalAmount + ", changeAmount=" + changeAmount + ", logReason=" + logReason
			+ "]";
}
	
}
