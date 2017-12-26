package com.java8.lambda.domain;

public class Person {

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int age;

	public Person() {
		this.firstName = "";
		this.lastName = "";
		this.dateOfBirth = "";
		this.age = 0;
	}

	public Person(String firstName, String lastName, String dateOfBirth, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + "]";
	}

}
