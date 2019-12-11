package com.cpg.queue.priorityqueue;

public class Student implements Comparable<Student> {

	Integer age;
	String name;
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		
		return this.age.compareTo(o.age);
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	

}
