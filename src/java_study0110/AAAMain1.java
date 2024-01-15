package java_study0110;

import BBB.BBB;

public class AAAMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA aaa = new AAA();
		aaa.aaa = 7;
		BBB bbb = new BBB();
		bbb.bbb = 7;
		System.out.println("aaa : " + aaa.getAAA() + ", bbb : " + bbb.bbb);
		
		Rectangle1 r1 = new Rectangle1(4,5);
		System.out.println(r1.getArea());
		Rectangle1 r2 = new Rectangle1(-4,5);
		System.out.println(r2.getArea());
	}

}
