package com.cpg.threads.thread1;

public class MainThread2 {
public static void main(String[] args) {
	System.out.println("main started");
	Thread2 t2=new Thread2();  //--->start() is not present
	 
	Thread t=new Thread(t2);   //---> therefore created an object of thread class
	t.start();
	System.out.println("main ended");
}
}
