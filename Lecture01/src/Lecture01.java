import java.awt.Point;

public class Lecture01 {
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		
		double d1 = 7.5;
		System.out.println(d1);
		/******************************************************
		*float d2 = 7.5;  Error                               *
		* เปลี่ยนเป็น  float d2 = (float) 7.5 ใส่ casting operator  *
		* ****************************************************/
		
		
		/**************************************
		* new = การจองพื้นที่                       *
		* class = data type -> Point          *
		* object = ตัวแปร -> 2 objects = p1,p2  *
		* ************************************/
		
		Point p1 = new Point(1,2); 
		Point p2 = new Point(3,4);
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
