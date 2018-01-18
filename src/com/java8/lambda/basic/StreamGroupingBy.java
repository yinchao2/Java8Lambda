package com.java8.lambda.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupingBy {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("WWW", "CCC", "JJJ", "AAA", "BBB", "BBB", "AAA", "BBB", "WWW");

		// *** group by
		Map<String, Long> mp = list.stream().collect(
											Collectors.groupingBy(
													Function.identity(), Collectors.counting()
											)
								);

		mp.forEach((k, v)->{
			System.out.println("Key: " + k + " | Value: " + v);
		});
		
		System.out.println("=======================================");
		
		// *** sort Map
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		mp.entrySet().stream()
					.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
					.forEachOrdered(e->finalMap.put(e.getKey(), e.getValue()));
		
		finalMap.forEach((k, v)->{
			System.out.println("Key: " + k + " | Value: " + v);
		});
	}
}
