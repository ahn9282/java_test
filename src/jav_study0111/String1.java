package jav_study0111;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Simple String");
		String str2 = "The Best String";

		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println();

		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println();
		System.out.println();
		System.out.println();
		showString("Funny String");
	}


	public static void showString(String str) {
		System.out.println(str);
		System.out.println(str.length());
	}
}
