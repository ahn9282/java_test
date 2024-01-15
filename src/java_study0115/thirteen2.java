package java_study0115;

public class thirteen2 {
	public static void main(String[] args) {
		int[] ar1=new int[10];
		int sum = 0; //ㄴㅁㅇㄴㅁㅇ
		for(int i= 0 ;i < ar1.length;i++) {
			ar1[i] = i+1;
			sum+=ar1[i];
			System.out.println("이번 " + i + "번 째 배열 인덱스 값 : " + ar1[i] + ", 값들의 합" + sum);
		}
		System.out.println("Hi owsd");
	}

}
