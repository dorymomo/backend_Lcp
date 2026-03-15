package com.oulim.app.kkomi.dto;

import java.time.LocalDateTime;

public class UserMissionDTO {
//	CREATE TABLE TBL_USER_MISSION(
//			Mission_ID NUMBER,
//			User_No NUMBER,
//			MISSION_COUNT NUMBER,
//			MISSION_IS_REWARD NUMBER(1),
//			Mission_last_update_date date,
//			CONSTRAINT PK_TBL_USER_MISSION PRIMARY KEY(Mission_ID, User_No),
//			CONSTRAINT FK_USERMISSION_USER FOREIGN KEY(User_No) REFERENCES TBL_USER(User_No) ON DELETE CASCADE,
//			CONSTRAINT FK_USERMISSION_MISSION FOREIGN KEY(Mission_ID) REFERENCES TBL_MISSION(Mission_ID) ON DELETE CASCADE
//		);


	private int missionID; 	// 미션ID
	private int userNo; // 유저 번호
	private int missionCount; // 진행 횟수
	private boolean isRewarded; // 보상 수령 여부
	private LocalDateTime lastUpdateDate; // 마지막 미션 변동 시기 
	private String missionName; // 미션 이름
	private String missionDetail; // 미션 설명
	private int rewardId; // 보상 ID

	public boolean isRewarded() {
		return isRewarded;
	}

	public void setRewarded(boolean isRewarded) {
		this.isRewarded = isRewarded;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public String getMissionDetail() {
		return missionDetail;
	}

	public void setMissionDetail(String missionDetail) {
		this.missionDetail = missionDetail;
	}

	public int getRewardId() {
		return rewardId;
	}

	public void setRewardId(int rewardId) {
		this.rewardId = rewardId;
	}

	public int getMissionID() {
		return missionID;
	}

	public void setMissionID(int missionID) {
		this.missionID = missionID;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getMissionCount() {
		return missionCount;
	}

	public void setMissionCount(int missionCount) {
		this.missionCount = missionCount;
	}

	public boolean isMissionIsReward() {
		return isRewarded;
	}

	public void setMissionIsReward(boolean missionIsReward) {
		this.isRewarded = missionIsReward;
	}

	public LocalDateTime getMissionLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setMissionLastUpdateDate(LocalDateTime missionLastUpdateDate) {
		this.lastUpdateDate = missionLastUpdateDate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
