
public class Circle extends PrintableObject implements Shape {

	double radius;
	
	//Implement standard constructors: no-arg as well as specialized constructor that
	//receives the radius.
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	//define the attribute and the standard accessor and mutator
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//override and return the shape name (by calling the method in the
	//base class), followed by the value of the radius (separated by comma)
	public String toString() {
		return super.getName() + ", " + this.radius + ", ";
	}
	
	//A static parse() method that receives an input string and instantiates and returns
	//a Circle object whose radius is initialized with the value in the input string. The
	//input string is in comma separated format,i.e.:
	//“Circle,1”. The method returns the object as Circle.
	public static Circle parse(String input) {
		String[] Input = input.split(",");
		double Radius = Double.parseDouble(Input[1]);
		return new Circle(Radius);
	}
	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (2 * Math.PI * this.radius);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI * Math.pow(this.radius, 2));
	}

	//Implement/override the getName() method and make sure the returned name is in
	//ALL-CAPS
	public String getName() {
		return super.getName().toUpperCase();
	}
	
}
