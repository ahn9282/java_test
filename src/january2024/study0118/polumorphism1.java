package january2024.study0118;

public class polumorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapearr = new Shape[5];
		shapearr[0] = new Circle();
		shapearr[1] = new Circle();
		shapearr[2] = new Circle();
		shapearr[3] = new Circle();
		shapearr[4] = new Circle();
		for(Shape shape : shapearr) {
			System.out.println(shape);
		}
		Shape[] shapearr2 = {new Circle(),new Rectangle()};
		for(Shape shape : shapearr2) {
			System.out.println(shape);
		}
		shapearr2 = new Shape[5];
		for(Shape shape : shapearr2) {
			System.out.println(shape);
		}
		//shapearr2 = {new Circle(),new Rectangle(),new Rectangle(),new Rectangle(),new Rectangle()};
	}

}

class Shape {
	static int num=0;
	public Shape(){
		System.out.println(num);
		num++;
	}

}

class Circle extends Shape {

}

class Rectangle extends Shape {

}
