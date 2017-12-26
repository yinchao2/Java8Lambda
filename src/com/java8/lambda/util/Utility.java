package com.java8.lambda.util;

import java.util.ArrayList;
import java.util.List;

import com.java8.lambda.domain.Person;

public class Utility {
	
	public static List<Person> getPersonList() {
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Khem", "Heng", "2000-01-01", 18));
		personList.add(new Person("Jame", "William", "2001-02-01", 17));
		personList.add(new Person("Golding", "Lee", "2002-03-01", 16));
		personList.add(new Person("Lynda", "Sar", "1990-04-01", 28));
		personList.add(new Person("Xi", "Liu", "2004-05-01", 14));
		personList.add(new Person("Jenna", "Ankor", "2004-05-01", 13));
		
		return personList;
	}
	
	/**
	 * Iterator list with Java 8
	 * @param personList
	 */
	public static void print(List<Person> personList) {
 
		personList.forEach(person-> {
			System.out.println(person.toString());
		});
	}

}
