package Object;
import java.awt.Point;
public class CloneDemo1 {
	public static void main(String args[]) {
		/*A1 obj1 = new A1(37);
//A1 obj2 = (A1) obj1.clone(); -> clone
//A1 obj2 = new A1(obj1); -> copy constructor
		A1 obj2 = A1.newInstace(obj1); // -> static factory
		System.out.println(obj2.x);
		obj1.p.x = 10;
		System.out.println(obj1.p);
		System.out.println(obj2.p);*/
		A1 obj1 = new A1(37);
		try {
			A1 obj2 = (A1) obj1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class A1 implements Cloneable{
	public int x;
	public Point p;
	public A1(int i) {
		x = i;
		p = new Point(x,x);
	}
	// copy constructor -> use to copy
	public A1(A1 other) {
		this(other.x);
	}

	//static factory -> use to copy
	public static A1 newInstace(A1 other) {
		A1 obj = new A1(other.x);
		return obj;
	}
	
	public Object clone() throws CloneNotSupportedException {
			return super.clone();
	}
}
