package java_study0110;

public class Circle1{

	private double PI = 3.14;
	private double rad = 0;
	public Circle1(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r<0) {
			rad = 0;
			return;
		}
		rad = r;
	}
	public double getArea() {
		return (rad * rad) * PI;
	}
}
class Rectangle{
	int width;
	int height;
	int getArea() {
		return width * height;
	}
}
