package com.daicent.javacollections.thread;

import java.util.Iterator;

public class TestThread extends Thread{
	private String threadName;
	
	


	public String getThreadName() {
		return threadName;
	}
	
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public TestThread(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getThreadName() + " " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		TestThread t1 = new TestThread("a");
		TestThread t2 = new TestThread("b");
		t1.start();
		t2.start();
	}
}
