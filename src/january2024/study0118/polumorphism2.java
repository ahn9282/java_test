package january2024.study0118;

public class polumorphism2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cake c1 = new strawberrycheescake();
		cheescake c2 = new strawberrycheescake();
		cake c3 = new cheescake();
		
		c1.yummy();
		c2.yummy();
		c3.yummy();
		
	}
}
class cake{
	public void yummy() {
		System.out.println("cake");
	}
}
class cheescake extends cake{
	public void yummy() {
		super.yummy();
		System.out.println("cheesecake");
	}
}
class strawberrycheescake extends cheescake{
	public void yummy() {
		super.yummy();
		System.out.println("strawberrycheescake");
		System.out.println();
	}
}