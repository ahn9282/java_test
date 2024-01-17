package january2024.study0117;

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1 = new B1();
		A1 b2 = new B1();
		System.out.println(b1.a);
		b1.a = 15;
		System.out.println(b1.a);
		b1.funA1(); 
		b2.funA1(); 
		b1.funB1(); 
	}

}
class A1{
	int a;
	public A1() {
		System.out.println("A생성");
	}
	public void funA1() {
		System.out.println("A1 의기능입니다.");
	}
}
class B1 extends A1{
	public void funB1() {
		System.out.println("B1 의기능입니다.");
	}
}