package com.daicent.javacollections.thread.sychronized;

import java.util.Random;

public class Thread2 extends Thread{
	SharedData sharedData;

	public Thread2(SharedData sharedData) {
		super();
		this.sharedData = sharedData;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (sharedData) {
				System.out.println("T2 > i > " + i);
				sharedData.notifyAll();
				
				try {
					sharedData.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				int result =  sharedData.rad * sharedData.rad;
				 System.out.println("T1 > " + result);
			}
			
		}
	}
}
