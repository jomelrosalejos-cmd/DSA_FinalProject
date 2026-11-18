package project;

public class StrengthAnalysisScreen extends Screen {

	// placeholder results (design only)
	String upperAnimal = "GORILLA ARMS";
	String coreAnimal = "CROCODILE CORE";
	String lowerAnimal = "CHICKEN LEGS";

	void show() {
		clear();
		render();
		handleInput();
	}

	void render() {
		printHeader("ANALYSIS");

		System.out.println(font.Red() + "PERSONALIZED COMMENT:" + RESET);
		String comment = """
				You've got arms like a GORILLA, a core like a
				CROCODILE, but legs like a CHICKEN!
				""";
		font.Yellow();
		System.out.println(comment.indent(4) + RESET);

		String detail = 
				"""
				Your upper body and core are impressive, but your
				lower body seems to have missed the training session.
				""";
		font.White();
		System.out.print(detail.indent(4) + RESET);

		System.out.println(font.Cyan() + "-".repeat(72) + RESET);

		System.out.println("\n" + font.Red() + "SYSTEM NOTES:" + RESET);
		printNote(upperAnimal, """
				Your upper-body performance is outstanding.
				Keep those arms strong!
				""");
		printNote(coreAnimal, """
				Your core shows excellent endurance and stability.
				""");
		printNote(lowerAnimal, """
				Your legs need serious attention. Don't let your
				upper body do all the work!
				""");

		System.out.println(font.Cyan() + "-".repeat(72) + RESET);

		System.out.println(font.Red() + "OVERALL COMMENT:" + RESET);
		String overall = """
				Overall, you've been doing great! Don't forget to stay consistent,
				trust your progress, and be easy on yourself. Remember, improvement
				takes time. Keep showing up, keep pushing forward, and don't forget
				to give yourself credit for how far you've come. Every step counts!
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

	void printNote(String animal, String text) {
		System.out.println(font.LightGreen() + "* " + animal + RESET);
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
