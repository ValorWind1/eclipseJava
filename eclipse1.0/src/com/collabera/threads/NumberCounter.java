package com.collabera.threads;

public class NumberCounter extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()+ " has started");		
		for(int i = 0;i < 100;i ++) {
			System.out.println("Thread "+ Thread.currentThread().getId()+": "+i);
		
		 
			}
			
		}
	public void print(String n) {
		synchronized(this) {
			
		}
	}
			
		//super.run();
		
	}
	


