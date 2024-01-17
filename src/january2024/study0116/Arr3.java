package january2024.study0116;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		final int CIRCLE_MAX = 3;
		Circle[] car = new Circle[CIRCLE_MAX];
		Scanner sc = new Scanner(System.in);

		double sum = 0;
		for(int i =0; i< car.length;i++) {
			System.out.println("반지름을 입력하세요");
			System.out.print(">>");
			int ra = sc.nextInt();
			car[i] = new Circle(ra);
			sum+=car[i].getArea();
		}
		System.out.println("서클 넓이의 합 : " + sum);
	}
}

class Circle {
	static final double PI = 3.1415;
	private double radius;

	Circle(double rad) {
		radius = rad;
	}
	double getArea() {
		return (radius * radius) * PI;
	}
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레: " + peri);
	}

	void showArea() {
		double area = (radius * radius) * PI;
		System.out.println("넓이: " + area);
	}
}
