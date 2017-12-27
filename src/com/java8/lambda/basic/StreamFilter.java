package com.java8.lambda.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.lambda.domain.Person;

public class StreamFilter {

	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("Java", "C#", "Python", "Scala");
		
		// *** filter out unneeded string and convert stream to list
		List<String> resultList = ls.stream()
									.filter(str-> !str.equals("C#"))
									.collect(Collectors.toList());
		
		resultList.forEach(System.out::println);
		
		System.out.println("==========================================\n");
		
		// *** find object
		List<Person> personList = Arrays.asList(new Person("Jame","Golding", "1990-01-01", 27), 
												new Person("Lisa", "Golding", "1989-01-01", 28),
												new Person("William", "Golding", "1988-01-01", 29),
												new Person("Jenna", "Golding", "1987-01-01", 30));
		
		Person person = personList.stream()
									.filter(x->x.getFirstName().equals("Jenna"))
									.findAny()
									.orElse(null);
		
		System.out.println(person);
		
		System.out.println("==========================================\n");
		
		// *** find object and convert to string
		String firstName = personList.stream()
									.filter(x->x.getFirstName().equals("Lisa"))
									.map(Person::getFirstName) // convert to string
									.findAny()
									.orElse("");
		
		System.out.println("first name: " + firstName);
		
		System.out.println("==========================================\n");
		
		// *** convert stream to list 
		List<String> list = personList.stream()
										.map(Person::getFirstName)
										.collect(Collectors.toList());
		list.forEach(System.out::println);
		
	} 
}
