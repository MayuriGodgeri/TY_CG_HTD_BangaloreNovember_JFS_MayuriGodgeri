package com.cpg.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
public static void main(String[] args) 
{
	PriorityQueue p1=new PriorityQueue();
	p1.offer(12);
	p1.offer(4);
	p1.offer(44);
	p1.offer(100);
	p1.offer(89);
	//p1.offer(null); ---->nullpointerexception
	
	System.out.println(p1);
	System.out.println("------poll------");
	p1.poll();    //---->removes least element in collection
	p1.remove();
	for(Object o:p1)
	{
		System.out.println(o);
	}
	System.out.println("peek  :"+p1.peek());
	
	System.out.println("element :"+p1.element());
}
}
