package project;

public class PersonalInfoGather extends Screen {

	@Override
	void show() {
		boolean done = false;
		while(!done) {
			clear();
			render();
			done = handleInput();
		}
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
	
	boolean handleInput() {
		String instructions =
				"""
				Please fill this form as completely
				and accurately as possible.
				""";
		
		System.out.println(font.Red() + "\nInstruction: ");
		font.White();
		System.out.println(instructions.indent(4));
		font.Cyan();
		System.out.println("-".repeat(72));
		System.out.print(font.LightGreen() + "\nFirst Name: " + font.White());
		String firstName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.LightGreen() + "Last Name: " + font.White());
		String lastName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.LightGreen() + "Sex (M/F): " + font.White());
		String sex = input.nextLine();
		
		int age = 0;
		double height = 0;
		double weight =0;
		
		try {
			System.out.print(font.LightGreen() + "Age: " + font.White());
			age = Integer.parseInt(input.nextLine().trim());
			
			System.out.print(font.LightGreen() + "Height (Meters): " + font.White());
			height = Double.parseDouble(input.nextLine().trim());
			
			System.out.print(font.LightGreen() + "Weight (kg): " + font.White());
			weight = Double.parseDouble(input.nextLine().trim());
		}
		catch(NumberFormatException e) {
			System.out.println(font.Red() + "Invalid input. Please enter whole numbers for\n"
					+ "age and decimals for height and weight." + RESET);
			System.out.print("Press Enter to continue...");
			input.nextLine();
			return false;
		}
		
		Person person = new Person(firstName, lastName, sex, age, height, weight);
		//temporary code
		new SelectAssessmentScreen(person).show();
		return true;
	}

}
