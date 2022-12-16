import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shapeable> Shapes = new ArrayList<>();
		Shapes.add(new Circle(10));
		Shapes.add(new Rectangle(3, 4));
		
		for(Shapeable s : Shapes) {
			System.out.println(s.getArea());
			if (s instanceof Circle) System.out.println(((Circle)s).getDiameter());
		}
	}

}
