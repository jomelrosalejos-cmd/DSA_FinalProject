package project;

import java.util.Scanner;

public abstract class Screen {
	
	Scanner input = new Scanner(System.in);
	
	final String RESET  = "\u001B[0m";
	
	void clear() {
		System.out.print("\u001B[H\u001B[2J\u001B[3J");
		System.out.flush();
	}
	
	abstract void render();

}
