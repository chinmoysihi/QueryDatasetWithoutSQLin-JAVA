package com;

import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class TopTenEconomy {

	
	public static void economy(ArrayList<Deliveries> darr,ArrayList<Matches> matt) {
		
		LinkedHashMap<String,String> map= new LinkedHashMap<>();
		int trun=0;
		int tovr=0;
		for(Matches m : matt) {
			map.put(m.getMATCH_ID()	, m.getSEASON());
		}
		LinkedHashMap<String,String> smap= new LinkedHashMap<>();
		Set<Entry<String,String>> set= map.entrySet();
		
		for(Entry<String,String> entry:set) {
			int movr=0;
			for(Deliveries d:darr) {
				if(entry.getKey().toString().equals(d.getMATCH_ID())) {
					String key= entry.getValue().toString()+","+d.getBOWLER();
					String val="";
					if(!smap.containsKey(key)) {
						trun=Integer.parseInt(d.getWIDE_RUNS())+Integer.parseInt(d.getNOBALL_RUNS())+Integer.parseInt(d.getBATSMAN_RUNS());
						movr=1;
						tovr=1;
						smap.put(key, trun+","+tovr); 
					}else {
						int r=Integer.parseInt(d.getWIDE_RUNS())+Integer.parseInt(d.getNOBALL_RUNS())+Integer.parseInt(d.getBATSMAN_RUNS());
						String arr[]= smap.get(key).toString().split(",");
						trun=Integer.parseInt(arr[0]);
						tovr=Integer.parseInt(arr[1]);
						trun+=r;
						if(Integer.parseInt(d.getOVER())>movr) {
							tovr++;
							movr++;
						}
						smap.put(key, trun+","+tovr);
					}
				}
			}
		}
		LinkedHashMap<String,String> rmap= new LinkedHashMap<>();
		Set<Integer> syear= new TreeSet<>();
		Set<Entry<String,String>> sset= smap.entrySet();
		for(Entry<String,String> entry: sset) {
			String key= entry.getKey().toString();
			String yarr[]= key.split(",");
			int yr= Integer.parseInt(yarr[0]);
			String val=entry.getValue().toString();
			String arr[]=val.split(",");
			int ovr= Integer.parseInt(arr[1]);
			if(ovr>9) {
				rmap.put(key, val);
				syear.add(yr);
			}
		}
		
		Set<Entry<String,String>> rset= rmap.entrySet();
		LinkedHashMap <String,Double> dmap= new LinkedHashMap<>();
		System.out.println("Year"+"   "+"Player"+"   "+"Economy");
		for(int s:syear) {
			Map<String,Double> dumap= new LinkedHashMap<>();
			int i=0;
			for(Entry<String,String> entry: rset) {
				String key= entry.getKey().toString();
				String yarr[]= key.split(",");
				int yr= Integer.parseInt(yarr[0]);
				if(s==yr) {
					String sarr[]= entry.getValue().split(",");
					DecimalFormat df = new DecimalFormat("#.##");
					double economy= Double.valueOf(df.format(Double.parseDouble(sarr[0])/Integer.parseInt(sarr[1])));
					dumap.put(key, economy);
				}
			}
			Map<String,Double> sortdumap= sortedMap(dumap);
			Set<Entry<String,Double>> sortset= sortdumap.entrySet();			
			for(Entry<String,Double> entry: sortset) {
				String key= entry.getKey();
				String karr[]=key.split(",");
				String year= karr[0];
				String player=karr[1];
				double eco= entry.getValue();
				System.out.println(year+"  "+player+"  "+eco);
				i++;
				if(i==10)
					break;
			}
			//System.out.println(sortdumap);
		}
		
		//System.out.println(rmap);
	}	
	
	public static Map sortedMap(Map<String,Double> map) {
		Set<Entry<String, Double>> set = map.entrySet();
        List<Entry<String, Double>> list = new ArrayList<Entry<String, Double>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Double>>()
        {
			public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
				// TODO Auto-generated method stub
				return (int) (((double)(o1.getValue())) - ((double)( o2.getValue() )));
			}
        } );
        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
        for(Map.Entry<String, Double> entry:list){
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
	}
}
