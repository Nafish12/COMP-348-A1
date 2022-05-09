import java.util.*;

public interface Printable {
	//a void method to print object’s info to the console.
	public void print();
	
	//A static print() method that receives a list of printables and calls their print()
	//methods
	public static void print(List <Printable> x) {
		print(x);
	}
}
