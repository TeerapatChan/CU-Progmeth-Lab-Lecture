public interface Shapeable{
	// implicitly public, static and final
	String LABLE = "Shape"; 

	// interface methods are implicitly abstract and public
	void draw();
	double getArea();
}