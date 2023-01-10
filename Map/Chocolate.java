package com.xworkz.Collection.Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Chocolate {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> map = new LinkedHashMap<String, Double>();

		map.put("Dairy milk", 30d);
		map.put("Cadbury", 247d);
		map.put("Nestle", 20d);
		map.put("Kisses", 44d);
		map.put("Nutties", 60d);
		map.put("5star", 90d);
		map.put("Dark", 600d);
		map.put("KIt kat", 70d);
		map.put("Borrnville", 15d);
		map.put("Snickers", 92d);

		System.out.println(map.size());

		if (map.isEmpty()) {
			System.out.println("Dat is absent");

		} else {
			System.out.println("Data is present");

		}
		System.out.println("===========entering keys===============");

		Set<String> keys = map.keySet();
		keys.forEach(s -> System.out.println(s));

		System.out.println("===============entering values============");
		Collection<Double> value = map.values();
		value.forEach(q -> System.out.println(q));

		System.out.println("===========Entering both value and keys=======");

		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			// System.out.println(entry.getValue());

		}

	}

}
