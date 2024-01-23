package january2024.study0122;

public class ex2 {
	public static void main(String[] args) {
	Object obj = new Circle(10);

	System.out.println(obj);//컴파일러가 자동으로 obj.toString을 해준다.
}}
class Circle{
	double rad;
	public Circle(int num) {
		this.rad = num;
	}
	double getArea() {
		return (double)(rad * rad)* Math.PI;
	}
	public String toString() {
		return "넓이는" + getArea() + "입니다.";
	}
}
