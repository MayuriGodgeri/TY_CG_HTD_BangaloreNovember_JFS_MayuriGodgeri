package com.cpg.threads.thread1;

public class User extends Thread{
	PVR p;

	public User(PVR p) {

		this.p = p;
	}

	public void run()
	{
		p.confirmTickets();
	}
}
