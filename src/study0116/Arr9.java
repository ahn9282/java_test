package study0116;

import java.util.Scanner;

public class Arr9 {

	public static void main(String[] args) {
		Rectangle[] arr = new Rectangle[3];
		Scanner sc =new Scanner(System.in);
		for(int i =0; i< arr.length;i++) {
			System.out.println("Index : " + i);
			System.out.print("가로 : ");
			int w = sc.nextInt();
			System.out.print("세로 : ");
			int h = sc.nextInt();
			arr[i] = new Rectangle(w,h);
		}
			totalArea(arr);
	}
	static int totalArea(Rectangle[] arr) {
		int sum=0;
		for(int i =0;i < arr.length;i++) {
			sum+= arr[i].getArea();
		}
		System.out.println(sum);
		return sum;
	}
}

class Rectangle {
	int width;
	int height;

	Rectangle(int num1, int num2) {
		this.width = num1;
		this.height = num2;
		getArea();
	}

	int getArea() {
		return width * height;
	}
}
