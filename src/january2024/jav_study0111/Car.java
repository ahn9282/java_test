package january2024.jav_study0111;

public class Car {
	public Car(){
		System.out.println("차에요");
	}

	public static void main(String[] args) {
		Car car = new Car();
		
		Boat my = new Boat();
		my.myBoat();
		
		UpDown up = new UpDown();
		up.up(7);
		up.up(10);
		up.up(4,6);
		System.out.println(up.num);
		up.up(5.9);
		System.out.println(up.num);
		up.up("AAA");
		up.up("BBB", "CCC");
		up.up(7,'k');

	}
}
class Boat{
	void myBoat() {
		System.out.println("내 보트");
	}
}
class UpDown{
	double num = 0;
	void up(int num) {
		this.num+=num;
		System.out.println(num);
	}	void up(double num) {
		this.num+=num;
		System.out.println(num);
	}void up(int num1, int num2) {
		this.num+=(num1 + num2);
		System.out.println(num);
	}
	void up(String str) {
		System.out.println(num + str);
	}
	void up(String str1, String str2) {
		System.out.println(num + str1 + str2);
	}
}
