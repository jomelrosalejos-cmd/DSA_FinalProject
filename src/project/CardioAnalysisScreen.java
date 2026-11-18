package project;

import java.util.List;

public class CardioAnalysisScreen extends Screen {

	String jacksAnimal;
	String kneesAnimal;
	String climbersAnimal;
	
	
	CardioAnalysisScreen(Session session){
		List<Result> results = session.getCardioResults();
		jacksAnimal = results.get(0).animal;
		kneesAnimal = results.get(1).animal;
		climbersAnimal = results.get(2).animal;
	}

	void show() {
		clear();
		render();
		handleInput();
	}

	void render() {
		printHeader("ANALYSIS");

		String comment = """
				You've got the speed of a %s, the stamina
				of a %s, and the endurance of a %s!
				""".formatted(
						jacksAnimal.substring(0,jacksAnimal.indexOf(" ")),
						kneesAnimal.substring(0,kneesAnimal.indexOf(" ")),
						climbersAnimal.substring(0,climbersAnimal.indexOf(" ")));

		System.out.println(font.Red() + "SYSTEM NOTES:" + RESET);
		font.Yellow();
		System.out.println(comment+ RESET);
		printNote("JUMPING JACKS - " + jacksAnimal, """
				
				
				""");
		printNote("HIGH KNEES - " + kneesAnimal, """
				
				
				""");
		printNote("MOUNTAIN CLIMBERS - " + climbersAnimal, """
				
				
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

	// waits for the user to press Enter, then the AssessmentRunner returns to the main menu
	void handleInput() {
		System.out.print(font.LightGreen() + "Press Enter to return to the main menu..." + font.White());
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
