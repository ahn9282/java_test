package java_study0108;

class A {
	int a = 10;

	public int getA() {
		return a;
	}

	public void setA(int b) {
		a = b;
	}
}

class B {
	int b = 7;

	public int getB(int num) {
		b = num * num;
		return b;
	}
}

class Circle {
	final double PI = Math.PI;
	double radius;

	public double Area(double num) {
		double Area = num * num * PI;
		return Area;
	}

	public double getArea() {
		double Area = radius * radius * PI;
		return Area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	
}

class Rectangle {
	int width;
	int height;
	int Area;
	//생성자(constructor)
	//1. 리턴타입이 없음 2. 클래스 이름과 같은 함수 이름 3. return이 없음
	public Rectangle() {
		System.out.println("");
	}

	public int getArea() {
		return width * height;
	}
	public void setWidthHeight(int a, int b) {
		width = a;
		height = b;
	}
	public void setWidth(int a) {
		width = a;
	}
	
}

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("안녕하세요");
//			A a = new A();
//			A a1 = new A();
//			a1.a = 10;
//			System.out.println(a.a);
//			System.out.println(a1.a);
//			
//			int result = a.getA();
//			System.out.println(result);
//			
//			a.setA(20);
//			System.out.println(a.a);
//			B b =new B();
//			System.out.println(b);
//			System.out.println(b.b);
//			System.out.println(b.getB(7));
//			
		/*
		 * Circle c = new Circle(); //new는 객체를 생성하는 것을 의미 "Circle()"[생성자 함수]이라는 함수인 객체를
		 * 생성과 동시에 초기화 // new + 생성자함수 -> 객체 (instance)생성 System.out.println(c);
		 * System.out.println(c.PI); System.out.println(c.radius);
		 * System.out.println(c.Area(5)); System.out.println(c.getter(10) + " " +
		 * c.radius); System.out.println(c.getArea()); System.out.println(c.Area(20));
		 */

		Rectangle r = new Rectangle();
		Rectangle r2 = new Rectangle();
		r.width = 10;
		r.height = 10;
		r2.setWidthHeight(20, 20);
		System.out.println("사각형의 넓이 : " + r.getArea());
		System.out.println(r2.width + " " + r2.height);
		System.out.println("사각형의 넓이 : " + r2.getArea());
		r2.setWidth(30);
		System.out.println("사각형의 넓이 : " + r2.getArea());

	}

}
