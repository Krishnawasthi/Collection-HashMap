package com.collection.framework.hashmap.intro2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example3TreeMap {
	public static void main(String[] args) {
		
		//sorting is based on key
		TreeMap<String , String> treeMap = new TreeMap<String, String>();
//we are using linked hashmap so order will be remain same.
		
		//adding Key and values
		treeMap.put("karnataka", "bengaluru");
		treeMap.put("gujrat", "gandhi nagar");
		treeMap.put("gujrat", "gandhi nagar");
		treeMap.put("nagaland", "kohima");
		treeMap.put("panjab", "chandigarh");
		treeMap.put("haryana", "chandigarh");  
		
		System.out.println(treeMap );
		System.out.println(treeMap.get("haryana") );
		
		
		Iterator<Map.Entry<String, String>> itr = treeMap .entrySet().iterator();
		while(itr.hasNext()) {
		Map.Entry<String, String>	entry = itr.next();
		
		System.out.println(entry);
			
		
	}

}

}