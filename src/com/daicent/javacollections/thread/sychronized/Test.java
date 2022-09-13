package com.daicent.javacollections.thread.sychronized;

public class Test {
	public static void main(String[] args) {
		SharedData sharedData = new SharedData();
		Thread1 thread1 = new Thread1(sharedData);
		Thread2 thread2 = new Thread2(sharedData);
		thread1.start();
		thread2.start();
	}
}
