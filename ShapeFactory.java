package umldiagram;

import java.util.Scanner;

public class ShapeFactory  extends AbstractFactory{
	Rectangle rectangle= new Rectangle();
	public Shape getShape() {
		Shape shape=new Circle();
		Shape shape2= new Rectangle();
		Shape shape3= new Square();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Shape no you want \n1. Circle \n2. Rectangle \n3. Square");
		int choice= scanner.nextInt();
		switch (choice) {
		case 1:{
			shape.draw();
			return shape;
		}
		case 2:{
			shape2.draw();
			return shape2;
		}
		case 3:{
			shape3.draw();
			return shape3;
		}
		default:
			break;
		}
		return shape3;		
	}
}
