package project;

import java.util.List;

public class StrengthAnalysisScreen extends Screen {

	String upperAnimal;
	String coreAnimal;
	String lowerAnimal;
	
	Session session;
	
	StrengthAnalysisScreen(Session session){
		List<Result> results = session.getStrengthResults();
		upperAnimal = results.get(0).animal;
		coreAnimal = results.get(1).animal;
		lowerAnimal = results.get(2).animal;
	}

	void show() {
		clear();
		render();
		handleInput();
	}

	void render() {
		printHeader("ANALYSIS");

		String comment = """
				You've got arms like a %s, a core like a
				%s, but legs like a %s!
				""".formatted(
						upperAnimal.substring(0,upperAnimal.indexOf(" ")),
						coreAnimal.substring(0,coreAnimal.indexOf(" ")),
						lowerAnimal.substring(0,lowerAnimal.indexOf(" ")));
		
		

		System.out.println(font.Red() + "SYSTEM NOTES:" + RESET);
		font.Yellow();
		System.out.println(comment + RESET);
		printNote("PUSH-UPS - " + upperAnimal, """
				
				
				""");
		printNote("SIT-UPS - " + coreAnimal, """
				
				
				""");
		printNote("SQUATS - " + lowerAnimal, """
				
				
				""");

		System.out.println(font.Cyan() + "-".repeat(72) + RESET);

		System.out.println(font.Red() + "OVERALL COMMENT:" + RESET);
		String overall = """
				A true beast never stops evolving!
				Keep training, stay consistent, and ARISE!
				""";
		font.Yellow();
		System.out.print(overall.indent(4) + RESET);

		System.out.println(font.Cyan() + "=".repeat(72) + RESET);
	}

	// waits for the user to press Enter
	void handleInput() {
		System.out.print(font.LightGreen() + "Press Enter to continue..." + font.White());
		input.nextLine();
		System.out.print(RESET);
	}

	void printNote(String title, String text) {
		System.out.println(font.LightGreen() + "[" + title + "]" + RESET);
		font.White();
		System.out.println(text.indent(4) + RESET);
	}

	void printHeader(String title) {
		int margin = (72 - title.length())/2;

		System.out.println(font.Cyan() + "=".repeat(72));
		font.Green();
		font.Bold();
		System.out.println(" ".repeat(margin) + title + RESET);
		System.out.println(font.Cyan() + "=".repeat(72) + RESET);
	}

}
