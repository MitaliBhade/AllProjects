package designpattern;

//Use factory to get objects of subclasses
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      FShape shape1 = shapeFactory.getShape("CIRCLE");

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      FShape shape2 = shapeFactory.getShape("RECTANGLE");

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      FShape shape3 = shapeFactory.getShape("SQUARE");

	      //call draw method of square
	      shape3.draw();
	   }
	}

