package project;

public class MainMenuScreen extends Screen{
	
	AnsiColor color = new AnsiColor();
	
	void show() {
		while(true) {
			clear();
			render();
			handleInput();
		}
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
	    System.out.println(color.Red() + "**********************" + color.LightGreen() + " FITNESS ASSESSMENT SYSTEM "
	            + color.Red() + "***********************" + RESET);
	    
	    
	    System.out.println("\n" + " ".repeat(25) + color.Cyan() + "[1]" + color.White() +" Start Assessment");
	    System.out.println(" ".repeat(25) + color.Cyan() + "[2]" + color.White() +" Fitness Guidelines");
	    System.out.println(" ".repeat(25) + color.Cyan() + "[3]" + color.White() +" Exit\n");
	}
	
	private void handleInput() {
		System.out.print(color.LightGreen() + "Enter your choice: " + RESET);
	    String choice = input.nextLine().trim();
	    
	    switch(choice) {
	    case "1" -> new SelectAssessmentScreen();
	    case "2" -> System.out.println("placeholder for guidelines");
	    case "3" -> {
	    	clear();
	    	System.exit(0);
	    }
	    default -> {
	    	System.out.println(color.Red() + "Invalid choice. Please enter 1, 2, or 3." + RESET);
	    	System.out.print("Press Enter to continue...");
            input.nextLine();
	    }
	    }
	}
	
}
