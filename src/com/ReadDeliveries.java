package com;

import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;
public class ReadDeliveries {
	public static ArrayList<Deliveries> dell= new ArrayList<>();
	
	public static ArrayList readDataLineByLine(String csvFileInput) {
		int i=0,j=0;
		Deliveries d=null;
		String MATCH_ID=null;
		String INNING=null;
		String BATTING_TEAM=null;
		String BOWLING_TEAM=null;
		String OVER=null;
		String BALL=null;
		String BATSMAN=null;
		String BOWLER=null;
		String WIDE_RUNS=null;
		String BYE_RUNS=null;
		String LEGBYE_RUNS=null;
		String NOBALL_RUNS=null;
		String PENALTY_RUNS=null;
		String BATSMAN_RUNS=null;
		String EXTRA_RUNS=null;
		String TOTAL_RUNS=null;
		try {
			Reader in = new FileReader( csvFileInput );
	        CSVParser parser = new CSVParser( in, CSVFormat.DEFAULT );
	        List<CSVRecord> list = parser.getRecords();
	        for( CSVRecord row : list ) {
	        	//System.out.println(row);
	        	if(j>0) {
	        		for( String entry : row ) {
		        		//System.out.print(entry +" " );
		        		i++;
		        		//d= new Deliveries();
		        		if(i==1) 
		        			MATCH_ID=entry;
		        		else if(i==2) 
		        			INNING=entry;
		        		else if(i==3)
		        			BATTING_TEAM=entry;
		        		else if(i==4)
		        			BOWLING_TEAM=entry;
		        		else if(i==5)
		        			OVER=entry;
		        		else if(i==6)
		        			BALL=entry;
		        		else if(i==7)
		        			BATSMAN=entry;
		        		else if(i==8)
		        			BOWLER=entry;
		        		else if(i==9)
		        			WIDE_RUNS=entry;
		        		else if(i==10)
		        			BYE_RUNS=entry;
		        		else if(i==11)
		        			LEGBYE_RUNS=entry;
		        		else if(i==12)
		        			NOBALL_RUNS=entry;
		        		else if(i==13)
		        			PENALTY_RUNS=entry;
		        		else if(i==14)
		        			BATSMAN_RUNS=entry;
		        		else if(i==15)
		        			EXTRA_RUNS=entry;
		        		else if(i==16)
		        			TOTAL_RUNS=entry;
		        	}
	        		d= new Deliveries(MATCH_ID, INNING, BATTING_TEAM, BOWLING_TEAM, OVER, BALL, BATSMAN, BOWLER, WIDE_RUNS, BYE_RUNS, LEGBYE_RUNS, NOBALL_RUNS, PENALTY_RUNS, BATSMAN_RUNS, EXTRA_RUNS, TOTAL_RUNS);
	        		dell.add(d);
	        	}
	        	i=0;
	        	j++;
	        }
		}catch(Exception e) {
			e.printStackTrace();
		}
		return dell;
	}
}
