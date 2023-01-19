package umldiagram;

import java.util.Scanner;

public class ColourFactory extends AbstractFactory {

	public Color getColor() {
		Color color = new Red();
		Color color2 = new Blue();
		Color color3 = new Red();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No to get the colour \n1. Red\n2. Blue \n3. Green");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			color.fill();
			return color;
			
		}
		case 2: {
			color2.fill();
			return color2;
		}
		case 3: {
			color3.fill();
			return color3;
		}
		}
		return color3;
		
	}

//	 return color;

}
