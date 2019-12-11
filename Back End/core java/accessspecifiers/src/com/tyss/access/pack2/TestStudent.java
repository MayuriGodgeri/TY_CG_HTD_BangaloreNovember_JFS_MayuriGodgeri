package com.tyss.access.pack2;

import com.tyss.access.pack1.Student;

public class TestStudent extends Student
{
 protected TestStudent(String name)
 {
	 super(name);
 }
  void studDetails()
 {
	 System.out.println("student name is"+name);
 }
 public static void main(String[]arr)
 {
	Student s=new Student("mayu") ;
	//s.details();  ---->error
 }
 
}
