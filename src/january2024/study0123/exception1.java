package january2024.study0123;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(n1 / n2 );
		}
		catch(ArithmeticException | InputMismatchException e){
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("예외가 발생하였습니다.");
		}
		catch(Exception e){  // All Exception extends Exception (polymorphism)
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
		System.out.println("Good Bye~!");
		}
	}
}
