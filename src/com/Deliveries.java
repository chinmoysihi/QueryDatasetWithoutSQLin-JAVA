package com;

public class Deliveries {
	
	private String MATCH_ID;
	private String INNING;
	private String BATTING_TEAM;
	private String BOWLING_TEAM;
	private String OVER;
	private String BALL;
	private String BATSMAN;
	private String BOWLER;
	private String WIDE_RUNS;
	private String BYE_RUNS;
	private String LEGBYE_RUNS;
	private String NOBALL_RUNS;
	private String PENALTY_RUNS;
	private String BATSMAN_RUNS;
	private String EXTRA_RUNS;
	private String TOTAL_RUNS;
	
	public Deliveries() {	}
	
	public Deliveries(String mATCH_ID, String iNNING, String bATTING_TEAM, String bOWLING_TEAM, String oVER,
			String bALL, String bATSMAN, String bOWLER, String wIDE_RUNS, String bYE_RUNS, String lEGBYE_RUNS,
			String nOBALL_RUNS, String pENALTY_RUNS, String bATSMAN_RUNS, String eXTRA_RUNS, String tOTAL_RUNS) {
		super();
		MATCH_ID = mATCH_ID;
		INNING = iNNING;
		BATTING_TEAM = bATTING_TEAM;
		BOWLING_TEAM = bOWLING_TEAM;
		OVER = oVER;
		BALL = bALL;
		BATSMAN = bATSMAN;
		BOWLER = bOWLER;
		WIDE_RUNS = wIDE_RUNS;
		BYE_RUNS = bYE_RUNS;
		LEGBYE_RUNS = lEGBYE_RUNS;
		NOBALL_RUNS = nOBALL_RUNS;
		PENALTY_RUNS = pENALTY_RUNS;
		BATSMAN_RUNS = bATSMAN_RUNS;
		EXTRA_RUNS = eXTRA_RUNS;
		TOTAL_RUNS = tOTAL_RUNS;
	}

	public String getMATCH_ID() {
		return MATCH_ID;
	}

	public void setMATCH_ID(String mATCH_ID) {
		MATCH_ID = mATCH_ID;
	}

	public String getINNING() {
		return INNING;
	}

	public void setINNING(String iNNING) {
		INNING = iNNING;
	}

	public String getBATTING_TEAM() {
		return BATTING_TEAM;
	}

	public void setBATTING_TEAM(String bATTING_TEAM) {
		BATTING_TEAM = bATTING_TEAM;
	}

	public String getBOWLING_TEAM() {
		return BOWLING_TEAM;
	}

	public void setBOWLING_TEAM(String bOWLING_TEAM) {
		BOWLING_TEAM = bOWLING_TEAM;
	}

	public String getOVER() {
		return OVER;
	}

	public void setOVER(String oVER) {
		OVER = oVER;
	}

	public String getBALL() {
		return BALL;
	}

	public void setBALL(String bALL) {
		BALL = bALL;
	}

	public String getBATSMAN() {
		return BATSMAN;
	}

	public void setBATSMAN(String bATSMAN) {
		BATSMAN = bATSMAN;
	}

	public String getBOWLER() {
		return BOWLER;
	}

	public void setBOWLER(String bOWLER) {
		BOWLER = bOWLER;
	}

	public String getWIDE_RUNS() {
		return WIDE_RUNS;
	}

	public void setWIDE_RUNS(String wIDE_RUNS) {
		WIDE_RUNS = wIDE_RUNS;
	}

	public String getBYE_RUNS() {
		return BYE_RUNS;
	}

	public void setBYE_RUNS(String bYE_RUNS) {
		BYE_RUNS = bYE_RUNS;
	}

	public String getLEGBYE_RUNS() {
		return LEGBYE_RUNS;
	}

	public void setLEGBYE_RUNS(String lEGBYE_RUNS) {
		LEGBYE_RUNS = lEGBYE_RUNS;
	}

	public String getNOBALL_RUNS() {
		return NOBALL_RUNS;
	}

	public void setNOBALL_RUNS(String nOBALL_RUNS) {
		NOBALL_RUNS = nOBALL_RUNS;
	}

	public String getPENALTY_RUNS() {
		return PENALTY_RUNS;
	}

	public void setPENALTY_RUNS(String pENALTY_RUNS) {
		PENALTY_RUNS = pENALTY_RUNS;
	}

	public String getBATSMAN_RUNS() {
		return BATSMAN_RUNS;
	}

	public void setBATSMAN_RUNS(String bATSMAN_RUNS) {
		BATSMAN_RUNS = bATSMAN_RUNS;
	}

	public String getEXTRA_RUNS() {
		return EXTRA_RUNS;
	}

	public void setEXTRA_RUNS(String eXTRA_RUNS) {
		EXTRA_RUNS = eXTRA_RUNS;
	}

	public String getTOTAL_RUNS() {
		return TOTAL_RUNS;
	}

	public void setTOTAL_RUNS(String tOTAL_RUNS) {
		TOTAL_RUNS = tOTAL_RUNS;
	}

	@Override
	public String toString() {
		return "Deliveries [MATCH_ID=" + MATCH_ID + ", INNING=" + INNING + ", BATTING_TEAM=" + BATTING_TEAM
				+ ", BOWLING_TEAM=" + BOWLING_TEAM + ", OVER=" + OVER + ", BALL=" + BALL + ", BATSMAN=" + BATSMAN
				+ ", BOWLER=" + BOWLER + ", WIDE_RUNS=" + WIDE_RUNS + ", BYE_RUNS=" + BYE_RUNS + ", LEGBYE_RUNS="
				+ LEGBYE_RUNS + ", NOBALL_RUNS=" + NOBALL_RUNS + ", PENALTY_RUNS=" + PENALTY_RUNS + ", BATSMAN_RUNS="
				+ BATSMAN_RUNS + ", EXTRA_RUNS=" + EXTRA_RUNS + ", TOTAL_RUNS=" + TOTAL_RUNS + "]";
	}
	
	
}
