package com.cpg.query.arraydeque;

import java.util.ArrayDeque;

public class ArrayDeq1 
{
public static void main(String[] args) {

	ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
	a1.add(22);
	a1.add(44);
	a1.add(4);
	System.out.println(a1);
	
	ArrayDeque<String> a2=new ArrayDeque<String>();
	a2.add("mayu");
	a2.add("suchi");
	a2.add("nisha");
	System.out.println(a2);
	
	a2.addFirst("kiran");
	System.out.println(a2);
	a2.removeLast();
	System.out.println(a2);
	System.out.println(a2.peek());
	System.out.println(a2.peekLast());
	a2.offer("pankaj");
	System.out.println(a2);
	a2.push("mayu");
	System.out.println(a2);
	a2.pop();
	System.out.println(a2);
	
}

}
