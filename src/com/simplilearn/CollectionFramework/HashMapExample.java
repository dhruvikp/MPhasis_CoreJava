package com.simplilearn.CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "Amit");
		map.put(2, "Rahul");
		map.put(3, "Jai");

		
		
		/*Collection<String> vals = map.values();
		
		for(String val : vals) {
			System.out.println(val);
		}*/
		
		
		Set<Entry<Integer, String>> data = map.entrySet();

		Iterator<Entry<Integer,String>> itr = data.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer,String> entry =  itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		
	}

}
