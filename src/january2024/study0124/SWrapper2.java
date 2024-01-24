package january2024.study0124;

public class SWrapper2 {
public static void main(String[] args) {
	Integer n1 = Integer.valueOf(5);
	Integer n2 = Integer.valueOf("1024");
	System.out.println(Integer.max(n1,n2));
	System.out.println(Integer.min(n1,n2));
	System.out.println(Integer.sum(n1,n2));
	System.out.println();
	System.out.println("12의 2진 표현 : "  + Integer.toBinaryString(12));
	System.out.println("12의 8진 표현 : "  + Integer.toOctalString(12));
	System.out.println("12의 16진 표현 : "  + Integer.toHexString(12));
		 }
	}