package com.cpg.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2 
{
public static void main(String[] args) {
	
	PriorityQueue<Student> p1=new PriorityQueue<Student>();
	p1.offer(new Student(22,"mayu"));
	p1.offer(new Student(23,"suchi"));
	p1.offer(new Student(22,"mayu"));
	
	for(Object o:p1) {
		System.out.println(o);
	}
}
}
