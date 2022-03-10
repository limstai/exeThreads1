package controller;

public class printThreads extends Thread {

	@Override
	public void run() {
		System.out.println("Thread TID: " + this.getId());
	}
	
}