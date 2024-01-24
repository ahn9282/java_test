package january2024.study0124;

import java.util.Scanner;

public class ex0124_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
		String str = sc.nextLine();
		System.out.println("시작!");
		for (int i = 0; i <= str.length(); i++) {		
			System.out.println(str.substring(i).concat(str.substring(0, i)));
		}
	}

}
