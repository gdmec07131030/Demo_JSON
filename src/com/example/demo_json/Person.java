package com.example.demo_json;

import java.util.List;

public class Person {
    @Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phones=" + phones
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	String name;
    int age;
    List<String> phones;
	public Person() {
		super();
	}
	public Person(String name, int age, List<String> phones) {
		super();
		this.name = name;
		this.age = age;
		this.phones = phones;
	}
    
}
