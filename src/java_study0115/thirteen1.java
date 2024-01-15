package java_study0115;

public class thirteen1 {
	public static void main(String[] args) {
		int[] ar1=new int[5];
		ar1[0] = 1;
		ar1[1] = 2;
		ar1[2] = 3;
		ar1[3] = 4;
		ar1[4] = 5;
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		for(int i= 0 ;i < ar1.length;i++) {
			
			System.out.println("이번 " + i + "번 째 배열 인덱스 값 : " + ar1[i]);
		}
		
		double[] ar2 = new double[7];// 8 * 7 = 56바이트가 순차적
		
		float[] ar3;
		ar3 = new float[9]; // 4 * 9 = 36바이트
		
		String str = "qwer";
		System.out.println(str.length());
		
		System.out.println("배열 ar1의 길리 : " + ar1.length);
		System.out.println("배열 ar2의 길리 : " + ar2.length);
		System.out.println("배열 ar3의 길리 : " + ar3.length);
	}

}
