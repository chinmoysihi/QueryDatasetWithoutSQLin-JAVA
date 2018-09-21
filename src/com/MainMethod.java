package com;

import java.util.*;

public class MainMethod {
	
	public static final String CSV_deliveries="D:\\EclipseWorkSpace\\Querying_Data\\iplDataset\\deliveries.csv";
	public static final String CSV_matches="D:\\EclipseWorkSpace\\Querying_Data\\iplDataset\\matches.csv";
	static ArrayList dell=null;
	static ArrayList matt=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dell=ReadDeliveries.readDataLineByLine(CSV_deliveries);
        System.out.println(" Deliveries read Completed");
        
        matt=ReadMatches.readDataLineByLine(CSV_matches);
        System.out.println(" Matches read Completed");
        
        System.out.println();
        Top4TeamsFieldFirst.fieldFirst(matt);
        
        System.out.println();
        TotalFourSixScore.score(dell, matt);
        
        System.out.println();        
        TopTenEconomy.economy(dell, matt);
        
        System.out.println();
        TeamNetRunRate.netRunRate(dell, matt);

	}

}
