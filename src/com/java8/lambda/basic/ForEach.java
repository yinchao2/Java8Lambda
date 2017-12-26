package com.java8.lambda.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {

		// *** forEach with List
		List<String> ls = new ArrayList<>();
		ls.add("AAA");
		ls.add("TTT");
		ls.add("YYY");
		ls.add("EEE");
		
		ls.forEach(str-> {
			System.out.println(str);
		});
		
		System.out.println("\n");
		
		// ** loop with filter
		ls.stream()
			.filter(str->str.equals("YYY"))
			.forEach(System.out::println);
		
		
		System.out.println("\n");
		
		// ***  forEach with Map
		Map<String, Integer> mp = new HashMap<>();
		mp.put("Jan", 31);
		mp.put("Feb", 28);
		mp.put("Mar", 31);
		mp.put("Apr", 30);
		
		mp.forEach((k, v)->{
			System.out.println("key: " + k + " | value: " + v);
		});
	}

}
