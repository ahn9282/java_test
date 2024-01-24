package january2024.study0124;

import java.util.Random;

public class StudyMathandRandom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원주율" + Math.PI);
		System.out.println("2의 제곱근" + Math.sqrt(2));
		System.out.println();
		System.out.println("파이에 대한 각도" + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 각도" + Math.toDegrees(2.0 *Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);
		double radian90 = Math.toRadians(90);
		System.out.println("sin45 : "+ Math.sin(radian45));
		System.out.println("sin90 : "+ Math.sin(radian90));
		System.out.println("3의 5 제곱 : " + Math.pow(3, 5));
		System.out.println();
		
		Random rand = new Random();
		for(int i=0;i <7;i++) {
			System.out.print(rand.nextInt(10) +1);
			System.out.print("\t");
		}
		System.out.println("================");
		Random rand2 = new Random(1); // 시드값(Seed Value)
		for(int i=0;i <10;i++) {
			System.out.print(rand2.nextInt(10) +1);
			System.out.print("\t");
		}
		System.out.println();
		Random rand3 = new Random(2); // 시드값(Seed Value)
		for(int i=0;i <10;i++) {
			System.out.print(rand3.nextInt(10) +1);
			System.out.print("\t");
		}
	}
}
