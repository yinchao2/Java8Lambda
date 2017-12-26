package com.java8.lambda.basic;

import java.util.List;

import com.java8.lambda.domain.Person;
import com.java8.lambda.util.Utility;

/**
 * Sort the list of object with Java 8 Lamdba
 * @author YIN CHAO
 *
 */
public class SortList {

	public static void main(String[] args) {

		List<Person> personList;

		System.out.println("\n*****Sort by Name*****");
		personList = Utility.getPersonList();
		
		System.out.println("==== Before Sort ====");
		Utility.print(personList);
		
		// sort logic
		personList.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		
		// personList.sort((p1, p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		
		
		System.out.println("==== After Sort ====");
		Utility.print(personList);
		
		
		
		System.out.println("\n*****Sort by Age*****");
		personList = Utility.getPersonList();
		
		System.out.println("==== Before Sort ====");
		Utility.print(personList);
		
		// sort logic
		personList.sort((Person p1, Person p2)->p2.getAge()-p1.getAge());
		
		System.out.println("==== After Sort ====");
		Utility.print(personList);
	}
}
