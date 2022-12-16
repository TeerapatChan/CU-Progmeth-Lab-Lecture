public class ClassCreation {
	public static void main(String[] args) {
		C c1 = new C(5);
		B c2 = new B(4);
	}
}

class A {
	A() {
		System.out.println("class A");
	}
}

class B extends A {
	B(int val) {
		super(); // ถ้าไม่มี java สร้างให้เอง
		System.out.println("class B, value=" + val);
	}
	
	B(){
		
	}
}

class C extends B {
	C(int val) {
		//super(val); // ต้องมี เพราะการจะสร้าง B ต้องมี input
		System.out.println("class C, value=" + val);
	}
}