package umldiagram;

public class AbstractFactory {
	
	public Shape getShape() {
		ShapeFactory factory= new ShapeFactory();
		return factory.getShape();
	}
	public Color getColor() {
		ColourFactory colourFactory= new ColourFactory();
		return colourFactory.getColor();
	}
}
