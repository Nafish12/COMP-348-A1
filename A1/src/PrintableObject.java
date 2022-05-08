
public abstract class PrintableObject implements NamedObject, Printable {
	//overridden, returns the object’s name by calling getName() method
	public String toString() {
		return this.getName();
	}
	
	//prints the text returned by toString() method. The information is
	//printed in single line.
	@Override
	public void print() {
		System.out.println(toString());

	}

}
