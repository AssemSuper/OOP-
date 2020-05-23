package preparationForEndterm;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType== null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
			
		}
		else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}

ShapeFactory shapeFactory= new ShapeFactory();
Shape shape1=shapeFactory.getShape("CIRCLE");
Shape shape2=shapeFactory.getShape("RECTANGLE");
shape2.draw();
