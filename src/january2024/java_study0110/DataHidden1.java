package january2024.java_study0110;

public class DataHidden1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c = new Circle1(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(-3.3);
		System.out.println(c.getArea());
		System.out.println(c.getArea());
		
		
	}

}
