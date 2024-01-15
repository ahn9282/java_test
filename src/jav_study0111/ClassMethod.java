package jav_study0111;
class NumberPrinter{
	private int myNum =0;
	static void showInt(int n) {
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	void setMyNumber(int n) {
		myNum = n;
	}
	void showMyNumber() {
		showInt(myNum);	}
}
class Circle0111{
	double r;
	public Circle0111() {
		this.r = r;
	}
	double getArea(double r) {
		return r * r * Math.PI;
	}
	static double getStaticArea(double radius) {
		return radius * radius * Math.PI;

	}
}

public class ClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter.showInt(20);
        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);
    
        np.setMyNumber(75);
        np.showMyNumber();
        System.out.println(Circle0111.getStaticArea(5));
	}

}
