package january2024.study0124;

import java.math.BigDecimal;
import java.math.BigInteger;

public class StudyBigclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("최대 정수 : " + Long.MAX_VALUE);
		System.out.println("최소 정수 : " + Long.MIN_VALUE);
		System.out.println();
		System.out.println( Long.MAX_VALUE + 1);// 이 경우 최소값으로바뀜 << 오버플로우로 인해
		System.out.println();					// 최댓 ㄱ밧을 넘어서 다시 최솟 에서 시작
		BigInteger big1 = new BigInteger("10000000000000000000000000");
		BigInteger big2 = new BigInteger("-9999999999999999999999999");
		BigInteger big3 = new BigInteger("999999999999999999999999999999999999999");
		BigDecimal bd1 = new BigDecimal(123.1212155125215125125125152251512);
		BigDecimal bd2 = new BigDecimal(-123.1202155125215125125125152251512);
		
		BigInteger r1 = big1.add(big2);
		System.out.println("덧셈 결과 : " + r1);
		BigInteger r2 = big1.multiply(big2);
		System.out.println("곱셈 결과 : " + r2);
		
		BigInteger r3 = big1.add(big3);
		System.out.println("덧셈 결과 : " + r3);
		System.out.println();
		BigDecimal d1 = bd1.add(bd2);
		System.out.println("덧셈 결과" + d1);
		int num1 = r1.intValueExact();
		System.out.println("From BigInteger : " + num1);
		double num2 = d1.doubleValue();
		System.out.println("From BigDecimal : " + num2);
		
	}

}
