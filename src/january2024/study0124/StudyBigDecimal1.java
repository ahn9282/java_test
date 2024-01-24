package january2024.study0124;

import java.math.BigDecimal;

public class StudyBigDecimal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigDecimal d1 = new BigDecimal("1.6");
		BigDecimal d2 = new BigDecimal("0.1");
		System.out.println("덧셈 : " + d1.add(d2));
		System.out.println("뺼셈 : " + d1.subtract(d2));
		System.out.println("곱셈 : " + d1.multiply(d2));
	}

}
