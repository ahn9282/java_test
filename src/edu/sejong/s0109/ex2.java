package edu.sejong.s0109;

public class ex2 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.initTriangle(10, 1000);
		System.out.println("삼각형의 넓이는 " + t.getArea());
	}
}
class Triangle {
	int a;
	int b;
	public void initTriangle(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	public int getArea() {
		return a*b/2;
	}
	
}