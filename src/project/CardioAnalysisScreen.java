package project;

public class CardioAnalysisScreen extends Screen {

	// placeholder results (design only)
	String jacksAnimal = "STALLION";
	String kneesAnimal = "WOLF";
	String climbersAnimal = "MOUNTAIN GOAT";

	void show() {
		clear();
		render();
		handleInput();
	}

	void render() {
		printHeader("ANALYSIS");

		System.out.println(font.Red() + "PERSONALIZED COMMENT:" + RESET);
		String comment = """
				You've got the speed of a STALLION, the stamina
				of a WOLF, and the endurance of a MOUNTAIN GOAT!
				""";
		font.Yellow();
		System.out.println(comment.indent(4) + RESET);

		String detail = """
				Your cardio performance is impressive, but there's
				still room to improve your endurance and consistency.
				""";
		font.White();
		System.out.print(detail.indent(4) + RESET);

		System.out.println(font.Cyan() + "-".repeat(72) + RESET);

		System.out.println("\n" + font.Red() + "SYSTEM NOTES:" + RESET);
		printNote("JUMPING JACKS - " + jacksAnimal, """
				Your performance is outstanding! Keep that rhythm
				and coordination strong!
				""");
		printNote("HIGH KNEES - " + kneesAnimal, """
				Your stamina is developing well. Keep improving
				your speed and consistency!
				""");
		printNote("MOUNTAIN CLIMBERS - " + climbersAnimal, """
				Your endurance is good, but continue improving
				your core stability and pacing!
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
