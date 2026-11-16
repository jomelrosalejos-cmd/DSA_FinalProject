package project;

public class PersonalInfoGather extends Screen {

	@Override
	void show() {
		clear();
		render();
		handleInput();
	}
	
	void render() {
		String title = "PERSONAL INFORMATION";
		int margin = (72 - title.length())/2;

		System.out.println(font.Cyan() + "=".repeat(72));
		font.Green();
		font.Bold();
		System.out.println(" ".repeat(margin) + title  + RESET);
		System.out.println(font.Cyan() + "=".repeat(72));
	}
	
	void handleInput() {
		System.out.println(font.Red() + "Instruction: " + font.White() +
				"Please fill this form as completely and \naccurately as possible.");
		
		System.out.print(font.LightGreen() + "\nFirst Name: " + font.White());
		String firstName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.LightGreen() + "Last Name: " + font.White());
		String lastName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.LightGreen() + "Sex (M/F): " + font.White());
		String sex = input.nextLine();
		
		System.out.print(font.LightGreen() + "Age: " + font.White());
		int age = Integer.parseInt(input.nextLine().trim());
		
		System.out.print(font.LightGreen() + "Height (Meters): " + font.White());
		double height = Double.parseDouble(input.nextLine().trim());
		
		System.out.print(font.LightGreen() + "Weight (kg): " + font.White());
		double weight = Double.parseDouble(input.nextLine().trim());
		
		//temporary code
		new SelectAssessmentScreen().show();
	}

}
