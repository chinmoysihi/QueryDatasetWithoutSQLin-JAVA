package com;

public class Matches {
	private String MATCH_ID;
	private String SEASON;
	private String CITY;
	private String DATE;
	private String TEAM1;
	private String TEAM2;
	private String TOSS_WINNER;
	private String TOSS_DECISION;
	private String RESULT;
	private String WINNER;
	
	public Matches() {	}
	
	public Matches(String mATCH_ID, String sEASON, String cITY, String dATE, String tEAM1, String tEAM2,
			String tOSS_WINNER, String tOSS_DECISION, String rESULT, String wINNER) {
		super();
		MATCH_ID = mATCH_ID;
		SEASON = sEASON;
		CITY = cITY;
		DATE = dATE;
		TEAM1 = tEAM1;
		TEAM2 = tEAM2;
		TOSS_WINNER = tOSS_WINNER;
		TOSS_DECISION = tOSS_DECISION;
		RESULT = rESULT;
		WINNER = wINNER;
	}

	public String getMATCH_ID() {
		return MATCH_ID;
	}

	public void setMATCH_ID(String mATCH_ID) {
		MATCH_ID = mATCH_ID;
	}

	public String getSEASON() {
		return SEASON;
	}

	public void setSEASON(String sEASON) {
		SEASON = sEASON;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDATE() {
		return DATE;
	}

	public void setDATE(String dATE) {
		DATE = dATE;
	}

	public String getTEAM1() {
		return TEAM1;
	}

	public void setTEAM1(String tEAM1) {
		TEAM1 = tEAM1;
	}

	public String getTEAM2() {
		return TEAM2;
	}

	public void setTEAM2(String tEAM2) {
		TEAM2 = tEAM2;
	}

	public String getTOSS_WINNER() {
		return TOSS_WINNER;
	}

	public void setTOSS_WINNER(String tOSS_WINNER) {
		TOSS_WINNER = tOSS_WINNER;
	}

	public String getTOSS_DECISION() {
		return TOSS_DECISION;
	}

	public void setTOSS_DECISION(String tOSS_DECISION) {
		TOSS_DECISION = tOSS_DECISION;
	}

	public String getRESULT() {
		return RESULT;
	}

	public void setRESULT(String rESULT) {
		RESULT = rESULT;
	}

	public String getWINNER() {
		return WINNER;
	}

	public void setWINNER(String wINNER) {
		WINNER = wINNER;
	}

	@Override
	public String toString() {
		return "Matches [MATCH_ID=" + MATCH_ID + ", SEASON=" + SEASON + ", CITY=" + CITY + ", DATE=" + DATE + ", TEAM1="
				+ TEAM1 + ", TEAM2=" + TEAM2 + ", TOSS_WINNER=" + TOSS_WINNER + ", TOSS_DECISION=" + TOSS_DECISION
				+ ", RESULT=" + RESULT + ", WINNER=" + WINNER + "]";
	}
	
}
