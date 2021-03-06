package com;

import java.util.*;
import java.util.Map.Entry;


public class TeamNetRunRate {


	public static void netRunRate(ArrayList<Deliveries> darr,ArrayList<Matches> matt) {
		
		LinkedHashMap<String,String> map= new LinkedHashMap<>();
		int batrun=0 , batovr=0 , botrun=0 , botovr=0;
		
		for(Matches m : matt) {
			map.put(m.getMATCH_ID()	, m.getSEASON());
		}
		
		LinkedHashMap<String,String> batmap= new LinkedHashMap<>();
		LinkedHashMap<String,String> bomap=new LinkedHashMap<>();
		Set<Entry<String,String>> set= map.entrySet();
		for(Entry<String,String> entry:set) {
			int bamovr=0 , bomovr=0;
			for(Deliveries d:darr) {
				if(entry.getKey().equals(d.getMATCH_ID())) {
					String key1= entry.getValue() +","+ d.getBATTING_TEAM();
					String key2= entry.getValue() +","+ d.getBOWLING_TEAM();
					String val="";
					if(!batmap.containsKey(key1)) {
						batrun=Integer.parseInt(d.getTOTAL_RUNS());
						batovr=1;
						bamovr=1;
						batmap.put(key1, batrun+","+batovr);
					}else {
						int r=Integer.parseInt(d.getTOTAL_RUNS());
						String sarr[]= batmap.get(key1).split(",");
						batrun= Integer.parseInt(sarr[0])+r;
						batovr=Integer.parseInt(sarr[1]);
						if(Integer.parseInt(d.getOVER())>bamovr) {
							batovr++;
							bamovr++;
						}
						batmap.put(key1, batrun+","+batovr);
					}
					if(!bomap.containsKey(key2)) {
						botrun=Integer.parseInt(d.getTOTAL_RUNS());
						botovr=1;
						bomovr=1;
						bomap.put(key2, botrun+","+botovr);
					}else {
						int r= Integer.parseInt(d.getTOTAL_RUNS());
						String sarr[]= bomap.get(key2).split(",");
						botrun=Integer.parseInt(sarr[0])+r;
						botovr=Integer.parseInt(sarr[1]);
						if(Integer.parseInt(d.getOVER())>bomovr) {
							botovr++;
							bomovr++;
						}
						bomap.put(key2, botrun+","+botovr);
					}
				}
			}
		}
		
		LinkedHashMap<String,Double> rmap= new LinkedHashMap<>();
		Set<Entry<String,String>> batset= batmap.entrySet();
		Set<Integer> yset= new TreeSet();
		for(Entry<String,String>  entry: batset) {
			String key= entry.getKey();
			String karr[]= key.split(",");
			int yr= Integer.parseInt(karr[0]);
			yset.add(yr);
			String batval= entry.getValue();
			String bolval= bomap.get(key);
			String batsarr[]=batval.split(",");
			String bolsarr[]=bolval.split(",");
			double netRunRate= (Integer.parseInt(batsarr[0])/Integer.parseInt(batsarr[1]))-(Integer.parseInt(bolsarr[0])/Integer.parseInt(bolsarr[1]));
			rmap.put(key, netRunRate);
		}
		
		LinkedHashMap<String,Double> sortedrmap= new LinkedHashMap<>();
		Set<Entry<String,Double>> sortedrset= rmap.entrySet();
		for(int y: yset) {
			double brr=-99.99;
			String nkey="";
			double nval=0.0;
			for(Entry<String,Double> entry : sortedrset) {
				String key=entry.getKey();
				String karr[]=key.split(",");
				int year= Integer.parseInt(karr[0]);
				if(year==y) {
					double nrr= entry.getValue();
					if(nrr>brr) {
						brr=nrr;
						nkey=key;
						nval=nrr;
					}
				}
			}
			sortedrmap.put(nkey, nval);
		}
		
		System.out.println("Year"+"  "+"Team");
		Set<Entry<String,Double>> sset= sortedrmap.entrySet();
		for(Entry<String,Double> entry: sset) {
			String key= entry.getKey();
			String karr[]= key.split(",");
			System.out.println(karr[0]+"  "+karr[1]);
		}
	}
}
