package project;

public abstract class Screen {
	
	final String RESET  = "\u001B[0m";
	
	void clear() {
		System.out.print("\u001B[H\u001B[2J\u001B[3J");
		System.out.flush();
	}
	
	abstract void render();

}
