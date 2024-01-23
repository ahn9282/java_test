package january2024.study0123;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class exception4 {
	public static void fun1() throws ArithmeticException {
		System.out.println("함수 호출");//해당 메서드를 호출한 함수에
		System.out.println(4/0);     //명시한Exception을 넘겨버린다.
	}
	public static void fun2() throws  IOException {// uncheckedException
		System.out.println("함수 호출"); //try-catch 또는 throws 의 예외처리를 필수로 요구
	}
	public static void main(String[] args) { //main내 모든 예외를 JVM에게 던진다.
												// ---> main은 JVM이 호출하였다.
		try {
			fun1();
			fun2();
		} catch (IOException | ArithmeticException e) {
			System.out.println("error~");
			e.printStackTrace();
		}
		
		for(int i=0;i < 10;i++) {
			System.out.println(i);
		}
	}
}
