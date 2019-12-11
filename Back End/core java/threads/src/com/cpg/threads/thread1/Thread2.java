package com.cpg.threads.thread1;

public class Thread2 implements Runnable {

	
	public void run() {
		for(int i=0;i<4;i++)
		{
			System.out.println(i);
		}
	}

}
