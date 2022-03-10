package view;

import controller.printThreads;

public class Main {

	public static void main(String[] args) {
	
		for (int idthread = 0 ; idthread < 5 ; idthread++) {
		Thread printthread = new printThreads();
		printthread.start();
		
		}

	}

}
