package Java_Study0112;

import java.util.Scanner;

public class StirngE4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str =sc.nextLine();
		String reverse = "";
		for(int i =str.length()-1;i>=0;i--){
			reverse += str.charAt(i);
			}		
		System.out.println(reverse);
		}
	}


