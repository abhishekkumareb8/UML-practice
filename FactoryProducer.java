package umldiagram;

import java.util.Scanner;

public class FactoryProducer {

	public AbstractFactory getFactory() {
		AbstractFactory abstractFactory = new AbstractFactory();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation to perform \n1. To get Colour \n2. To get Shape");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: {
			abstractFactory.getColor();
			return abstractFactory;
		}
		case 2: {
			abstractFactory.getShape();
			return abstractFactory;
		}
		default:
			break;
		}
//		abstractFactory.getColor();
//		abstractFactory.getShape();
//		return abstractFactory;
		return abstractFactory;
	}
}
