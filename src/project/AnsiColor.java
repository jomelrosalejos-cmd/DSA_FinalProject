package project;

public class AnsiColor {
	
	private final String cyan = "\u001B[36m"; // cyan
	private final String yellow   = "\u001B[33m"; // yellow
	private final String red = "\u001B[31m";
	private final String green = "\u001B[32m";
	private final String white = "\u001B[97m";
	private final String lightGreen = "\u001B[92m";
	
	String Cyan() {
		return cyan;
	}
	String Yellow() {
		return yellow;
	}
	String Red() {
		return red;
	}
	
	String Green() {
		return green;
	}
	String White() {
		return white;
	}
	String LightGreen() {
		return lightGreen;
	}
}
