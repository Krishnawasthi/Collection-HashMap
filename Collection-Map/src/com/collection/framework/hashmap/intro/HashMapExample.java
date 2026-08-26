package com.collection.framework.hashmap.intro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String , String>  map = new HashMap<String, String>();

		
		map.put("Karnataka", "bengaluru");
		map.put("gujrat", "gandhi nagar");
		map.put("gujrat", "gandhi nagar");
		map.put("nagaland", "kohima");
		map.put("panjab", "chandigarh");
		map.put("haryana", "chandigarh");  
		
		System.out.println(map);
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
		Map.Entry<String, String>	entry = itr.next();
		
		System.out.println(entry);
			
		}
	}

}
