package de.claudioaltamura.java;

public class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Person of(String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}
}
