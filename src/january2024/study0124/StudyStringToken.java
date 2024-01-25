package january2024.study0124;

import java.util.StringTokenizer;

public class StudyStringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken() + ' ');
		}
		System.out.println();
		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8/2 = 44", "+-=/ :");
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken() + '\t');
		}
		String str = "inpa@tistory@com@super@power";

		StringTokenizer strr = new StringTokenizer(str, "@");
		while(strr.hasMoreTokens()) {
			System.out.print(strr.nextToken() + '\t');
		}		
	}

}
