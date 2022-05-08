import java.util.*;

public interface Printable {
	public void print();
	
	public static void print(List <Printable> x) {
		print(x);
	}
}
