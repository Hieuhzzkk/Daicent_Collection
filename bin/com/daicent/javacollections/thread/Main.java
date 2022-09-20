package com.daicent.javacollections.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread th1 = new MyThread();
		Thread thread = new Thread(th1);
		
		Mythread2 th2 = new Mythread2();
		
		thread.start();
		th2.start();
		thread.join();
		th2.join();
	}
}
