package january2024.study0118;

public class overrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle c1 = new CCircle(100);
		System.out.println(c1.getArea());
		RRectangle r1 = new RRectangle(10, 10);
		System.out.println(r1.getArea());

		figure[] arr = new figure[5];
		arr[0] = new CCircle(10);
		arr[1] = new TTriangle(10, 10);
		arr[2] = new RRectangle(20, 30);
		arr[3] = new CCircle(50);
		arr[4] = new RRectangle(10, 60);
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getArea() + "\t");
			sum += arr[i].getArea();
		}
		System.out.println("\n" + sum);

	}

}

class figure {
	double area;

	public double getArea() {
		return area;
	}
}

class TTriangle extends figure {
	int width, height;

	public TTriangle(int a, int b) {
		this.width = a;
		this.height = b;
	}

	public double getArea() {
		return width * height / 2.0;
	}
}

class CCircle extends figure {
	double r;

	public CCircle(double r) {
		this.r = r;
	}

	public double getArea() {
		return r * r * Math.PI;
	}
}

class RRectangle extends figure {
	int width;
	int height;

	public RRectangle(int width, int height) {
		this.width = width;
		this.height = height;

	}

	public double getArea() {
		return width * height;
	}
}
