package com.collection.framework.hashmap.intro1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleLinkedHasMap {
		public static void main(String[] args) {
			
			LinkedHashMap<String , String> linnkedhasmap = new LinkedHashMap<String, String>();
// we are using linked hashmap so order will be remain same.
			
			linnkedhasmap.put("Karnataka", "bengaluru");
			linnkedhasmap.put("gujrat", "gandhi nagar");
			linnkedhasmap.put("gujrat", "gandhi nagar");
			linnkedhasmap.put("nagaland", "kohima");
			linnkedhasmap.put("panjab", "chandigarh");
			linnkedhasmap.put("haryana", "chandigarh");  
			
			System.out.println(linnkedhasmap);
			
			Iterator<Map.Entry<String, String>> itr = linnkedhasmap.entrySet().iterator();
			while(itr.hasNext()) {
			Map.Entry<String, String>	entry = itr.next();
			
			System.out.println(entry);
				
			
		}

	}

}
