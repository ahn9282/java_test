package study0116;

import java.util.Scanner;

public class Arr6 {
	public static double sumOfCircle(Circle3[] arrCircle) {
		double sum = 0;
		for(int i =0;i < arrCircle.length;i++) {
			sum += arrCircle[i].getArea();
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		final int CIRCLE_MAX = 3;
		Circle3[] arrCircle = {new Circle3(5),new Circle3(10),new Circle3(100)};
		Circle3[] car = new Circle3[CIRCLE_MAX];
		Scanner sc = new Scanner(System.in);
		double sircleSum = sumOfCircle(arrCircle);

		double sum = 0;
		for(int i =0; i< car.length;i++) {
			System.out.println("반지름을 입력하세요");
			System.out.print(">>");
			int ra = sc.nextInt();
			car[i] = new Circle3(ra);
			sum+=car[i].getArea();
		}
		System.out.println("서클 넓이의 합 : " + sum);
	}
}

class Circle3 {
	static final double PI = 3.1415;
	private double radius;

	Circle3(double rad) {
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
