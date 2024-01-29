package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;

public class Test0129_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CircleT> list = new ArrayList<>();
		double sum = 0;
		for (int i = 1; i <= 10; i++) {
			list.add(new CircleT(i));
		}
		for (CircleT c : list) {
			System.out.println(c.getArea());
			sum += c.getArea();
		}
		System.out.println("sum of circle" + sum);
	}

}

class CircleT {
	double rad;
	final double PI = 3.14;

	CircleT(double d) {
		this.rad = d;

	}

	double getArea() {
		return rad * rad * PI;
	}
}