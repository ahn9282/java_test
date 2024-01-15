package java_study0115;

import java.util.Scanner;

public class twelve01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in을 빼고 source를 넣어 키보드 입력 대신 입력값을 source에서 갖고 옮
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();
		
		System.out.print("문자열 입력 : ");
		String str2 = sc.next();
		String str3 = sc.next();
		String str4 = sc.next();
		
		System.out.printf("입력된 문자열 1 ; %s \n", str1);
		System.out.printf("입력된 문자열 2 ; %s \n", str2);
		System.out.printf("입력된 문자열 2 ; %s \n", str3);
		System.out.printf("입력된 문자열 2 ; %s \n", str4);
	}
}
