package com;

import java.util.*;
import java.util.Map.Entry;

public class Top4TeamsFieldFirst {
public static void fieldFirst(ArrayList<Matches> matt) {
		
		Map<String,Integer> map= new HashMap();
		for(Matches m:matt) {
			if(m.getSEASON().toString().equals("2016") || m.getSEASON().toString().equals("2017")) {				
				if(m.getTOSS_DECISION().toString().equals("field")) {
					String key=m.getTOSS_WINNER()+","+m.getSEASON();
					if(!map.containsKey(key)) {
						map.put(key, 0);
					}else {
						int val=map.get(key)+1;
						map.put(key, val);
					}
				}
			}
		}
		//System.out.println(map);
		Map<String,Integer> sortedMap=sortedMap(map);
		//System.out.println(sortedMap);
		int i=0;
		Set<Entry<String,Integer>> set= sortedMap.entrySet();
		System.out.println();
		System.out.print("Year"+" "+"Team"+" "+"Count");
		System.out.println();
		for(Entry<String,Integer> entry:set) {
			if(i<4) {
				String key=entry.getValue().toString();
				String value= entry.getKey().toString();
				String arr[]=value.split(",");
				System.out.println(arr[1]+" "+arr[0]+" "+key);
			}else {
				break;
			}
			i++;
		}
		
	}
	
	public static Map sortedMap(Map<String,Integer> map) {
		Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return ((int)(o2.getValue())) - ((int)( o1.getValue() ));
            }
        } );
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry:list){
        	sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
	}
}
