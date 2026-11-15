package project;

import java.util.Scanner;

public class MainMenuScreen extends Screen{
	
	AnsiColor color = new AnsiColor();
	Scanner input = new Scanner(System.in);
	
	public MainMenuScreen() {
		clear();
		render();
	}
	
	void render() {
	    String[] art = {
	        "    _          _                 _____ _ _",
	        "   / \\   _ __ (_)_ __ ___   __ _|  ___(_) |_",
	        "  / _ \\ | '_ \\| | '_ ` _ \\ / _` | |_  | | __|",
	        " / ___ \\| | | | | | | | | | (_| |  _| | | |_",
	        "/_/   \\_\\_| |_|_|_| |_| |_|\\__,_|_|   |_|\\__|"
	    };

	    int inner = 70;
	    int width = 0;
	    for (String s : art) width = Math.max(width, s.length());
	    int margin = (inner - width) / 2;

	    String edge = color.Cyan() + "+" + "-".repeat(inner) + "+" + RESET;

	    System.out.println(edge);
	    for (String s : art) {
	        String padded = " ".repeat(margin) + s + " ".repeat(inner - margin - s.length());
	        System.out.println(color.Cyan() + "|" + color.Yellow() + padded + color.Cyan() + "|" + RESET);
	    }
	    System.out.println(edge);
	    System.out.println(color.Red() + "**********************" + color.Green() + " FITNESS ASSESSMENT SYSTEM "
	            + color.Red() + "***********************" + RESET);
	    
	    
	    System.out.println("\n" + " ".repeat(25) + "[1] Start Assessment");
	    System.out.println(" ".repeat(25) + "[2] Fitness Guidelines");
	    System.out.println(" ".repeat(25) + "[3] Exit\n");
	    
	    System.out.print("Enter your choice: ");
	    input.nextLine();
	    
	}
}
