package project;

import java.util.LinkedList;
import java.util.Queue;

public class AssessmentRunner {

	boolean includeStrength;
	boolean includeCardio;

	// choice is the menu number from SelectAssessmentScreen: 1 strength, 2 cardio, 3 both
	AssessmentRunner(String choice) {
		switch(choice) {
		case "1" -> includeStrength = true;
		case "2" -> includeCardio = true;
		case "3" -> {
			includeStrength = true;
			includeCardio = true;
		}
		default -> throw new IllegalArgumentException("Invalid assessment choice: " + choice);
		}
	}

	void start() {
		if (includeStrength) {
			if (!runExercises(strengthQueue())) {
				return;
			}
			showStrengthAnalysis();
		}

		if (includeCardio) {
			if (!runExercises(cardioQueue())) {
				return;
			}
			showCardioAnalysis();
		}
	}

	// the order of the exercises is decided here and nowhere else
	Queue<ExerciseScreen> strengthQueue() {
		Queue<ExerciseScreen> queue = new LinkedList<>();
		queue.add(new PushUpScreen());
		queue.add(new SitUpScreen());
		queue.add(new SquatScreen());
		return queue;
	}

	Queue<ExerciseScreen> cardioQueue() {
		Queue<ExerciseScreen> queue = new LinkedList<>();
		queue.add(new JumpingJacksScreen());
		queue.add(new HighKneesScreen());
		queue.add(new MountainClimbersScreen());
		return queue;
	}

	// shows the exercises one by one, returns false if the user stopped the workout
	boolean runExercises(Queue<ExerciseScreen> queue) {
		while(!queue.isEmpty()) {
			ExerciseScreen screen = queue.poll();
			screen.show();

			if (screen.stopped) {
				queue.clear();
				return false;
			}
		}
		return true;
	}

	void showStrengthAnalysis() {
		// TODO: replace with new StrengthAnalysisScreen().show();
		showPlaceholder("strength analysis");
	}

	void showCardioAnalysis() {
		// TODO: replace with new CardioAnalysisScreen().show();
		showPlaceholder("cardio analysis");
	}

	void showPlaceholder(String name) {
		System.out.println("placeholder for " + name);
		System.out.print("Press Enter to continue...");
		Screen.input.nextLine();
	}

}
