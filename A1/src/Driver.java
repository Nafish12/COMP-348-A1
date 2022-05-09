import java.util.*;
import java.io.*;

public class Driver {
	
	public static void main(String[] args) throws Exception{
		
		Scanner s = new Scanner(System.in);
		System.out.print("What is the file name:");
		String filename = s.nextLine();
		try(BufferedReader file = new BufferedReader(new FileReader(new File(filename)))){
			String line = "";
			ArrayList<Shape> shapes = new ArrayList<>();
			
			//verify each line, making sure there is no empty line
			while((line = file.readLine()) != null) {
				String[] section = line.split(",");
				
				//if section split in 3, then it's a rectangle
				//if section split in 2, then it's a circle
				if(section.length == 3) {
					shapes.add(Rectangle.parse(line));
				}
				if(section.length == 2) {
					shapes.add(Circle.parse(line));
				}
			}
			
			//Sort shape using Collection.sort and comparator
			//compare by name and area
			Collections.sort(shapes, new Comparator<Shape>(){

				@Override
				public int compare(Shape o1, Shape o2) {
					if(o1.getName().compareTo(o2.getName()) > 0) {
						return 1;
					}
					else if (o1.getName().compareTo(o2.getName()) < 0) {
						return -1;
					}
					else {
						if(o1.getArea() > o2.getArea()) {
							return 1;
						}
						else if (o1.getArea() < o2.getArea()) {
							return -1;
						}
						else {
							return 0;
						}
					}
				
				}
			});
			
			//To implement static Printable.print() method, use “vararg” for the argument type
			//and use Java “foreach” to loop through the elements
			for(Shape shape: shapes) {
				Printable printable = (Printable) shape;
				printable.print();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	} 
	
}
