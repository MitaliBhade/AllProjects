package designpattern;

//to generate the objects of sub classes
public class ShapeFactory {

	  public FShape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new FCircle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new FRectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new FSquare();
	      }
	      
	      return null;
	   }
	
}
