package com.jspiders.multithreading.main;

import com.jspiders.multithreading.MyThread1;
import com.jspiders.multithreading.MyThread2;

public class MyThreadMain {
	public static void main(String[] args) {
		MyThread1 myThread1=new MyThread1();
		System.out.println(myThread1.getName());
		myThread1.setPriority(4);
		myThread1.start();
		
		
		
		MyThread2 myThread2=new MyThread2();
		Thread thread=new Thread(myThread2);
		System.out.println(thread.getName());
		thread.setPriority(5);
		thread.start();
	}

}
