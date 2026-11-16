package project;

public class PersonalInfoGather extends Screen {

	AnsiFont font = new AnsiFont();
	
	@Override
	void show() {
		clear();
		render();
		handleInput();
	}
	
	void render() {
		String title = "PERSONAL INFORMATION" + RESET;
		int margin = (72 - title.length())/2;

		
		System.out.println(font.Cyan() + "=".repeat(72));
		System.out.println(" ".repeat(margin) + font.Cyan() + font.Bold() + title);
		System.out.println(font.Cyan() + "=".repeat(72));
	}
	
	void handleInput() {
		System.out.println(font.Red() + "Instruction: " + font.White() +
				"Please fill this form as completely and \naccurately as possible.");
		
		System.out.print(font.Yellow() + "\nFirst Name: " + font.White());
		String firstName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.Yellow() + "Last Name: " + font.White());
		String lastName = input.nextLine().toUpperCase().trim();
		
		System.out.print(font.Yellow() + "Sex (M/F): " + font.White());
		String sex = input.nextLine();
		
		System.out.print(font.Yellow() + "Age: " + font.White());
		int age = Integer.parseInt(input.nextLine().trim());
		
		System.out.print(font.Yellow() + "Height (Meters): " + font.White());
		double height = Double.parseDouble(input.nextLine().trim());
		
		System.out.print(font.Yellow() + "Weight (kg): " + font.White());
		double weight = Double.parseDouble(input.nextLine().trim());
	}

}
