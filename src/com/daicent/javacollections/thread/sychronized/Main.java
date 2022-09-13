package com.daicent.javacollections.thread.sychronized;

public class Main {
	public static void main(String[] args) {
		SharedData sharedData = new SharedData();
		CustomThread thread = new CustomThread(sharedData);
		CustomThread thread1 = new CustomThread(sharedData);

		CustomThread thread2 = new CustomThread(sharedData);
		CustomThread thread3 = new CustomThread(sharedData);

		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
