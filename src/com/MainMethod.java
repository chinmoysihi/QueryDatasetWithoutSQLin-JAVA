package com;

import java.util.*;

public class MainMethod {
	
	public static final String CSV_deliveries="D:\\EclipseWorkSpace\\QueryDatasetWithoutSQLin-JAVA\\iplDataset\\deliveries.csv";
	public static final String CSV_matches="D:\\EclipseWorkSpace\\QueryDatasetWithoutSQLin-JAVA\\iplDataset\\matches.csv";
	static ArrayList dell=null;
	static ArrayList matt=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dell=ReadDeliveries.readDataLineByLine(CSV_deliveries);
        System.out.println(" Deliveries read Completed");
        
        matt=ReadMatches.readDataLineByLine(CSV_matches);
        System.out.println(" Matches read Completed");
        
        System.out.println();
        System.out.println("Top 4 teams which elected to field first after winning toss in the year 2016 and 2017.");
        Top4TeamsFieldFirst.fieldFirst(matt);
        
        System.out.println();
        System.out.println("List  of Total number of fours, sixes, total score with respect to team and year");
        TotalFourSixScore.score(dell, matt);
        
        System.out.println();
        System.out.println("Top 10 best economy rate bowler with respect to year who bowled at least 10 overs");
        TopTenEconomy.economy(dell, matt);
        
        System.out.println();
        System.out.println("Team name which has Highest Net Run Rate with respect to year");
        TeamNetRunRate.netRunRate(dell, matt);

	}

}
