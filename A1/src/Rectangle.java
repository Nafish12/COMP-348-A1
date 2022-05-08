
public class Rectangle extends PrintableObject implements Shape {

	//Two sides as double: define the attributes and the corresponding accessors and
	//mutators
	private double side1, side2;
	
	//Implement standard constructors: no-arg as well as specialized constructor that
	//receives the sides
	public Rectangle() {
		this.side1 = 0;
		this.side2 = 0;
	}
	
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return this.side1;
	}
	
	public double getSide2() {
		return this.side2;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	//override and return the shape name (by calling the method in the
	//base class), followed by the two values for the sides (separated by comma).
	public String toString() {
		return super.toString() + ", " + this.side1 + ", " + this.side2;
	}
	
	/*
	 *A static parse() method that receives an input string and returns an instantiated
	 *Rectangle whose sides are initialized with the values in the input string. The input
	 *string is in comma separated format,i.e.: “Rectangle,2,3.5”. The method returns
	 *the object as Rectangle
	 */
	public static Rectangle parse(String input) {
		String[] Input = input.split(",");
		double side1 = Double.parseDouble(Input[1]);
		double side2 = Double.parseDouble(Input[2]);
		return new Rectangle(side1, side2);
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return ((2*this.side1)+ (2*this.side2));
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.side1*this.side2);
	}

}
