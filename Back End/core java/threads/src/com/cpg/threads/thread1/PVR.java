package com.cpg.threads.thread1;

 public class PVR {
	 synchronized void confirmTickets()
 {
	 for(int i=0;i<4;i++)
		{
			System.out.println(i);
		/*	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}}
		
			synchronized void leaveMe() {
				System.out.println("notify called");
				notifyAll();
			
		}
 }

