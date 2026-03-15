package com.oulim.app.kkomi.dto;

public class RankingDTO {
//	CREATE TABLE TBL_RANKING (
//			  User_No NUMBER,
//			  Rank_Point NUMBER NOT NULL,
//			  RANK_Season_Info NUMBER(6),
//			  CONSTRAINT PK_TBL_RANKING PRIMARY KEY (User_No, Rank_Season_Info),
//			  CONSTRAINT FK_RANKING_USER FOREIGN KEY(User_No) REFERENCES TBL_USER(User_No) ON DELETE CASCADE
//			);

	private int userNo;
	private int rankPoint;
	private int rankSeasonInfo;
	private int ranking;
	private int kkomiLev;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getRankPoint() {
		return rankPoint;
	}

	public void setRankPoint(int rankPoint) {
		this.rankPoint = rankPoint;
	}

	public int getRankSeasonInfo() {
		return rankSeasonInfo;
	}

	public void setRankSeasonInfo(int rankSeasonInfo) {
		this.rankSeasonInfo = rankSeasonInfo;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	public int getKkomiLev() {
		return kkomiLev;
	}
	
	public void setKkomiLev(int kkomiLev) {
		this.kkomiLev = kkomiLev;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
