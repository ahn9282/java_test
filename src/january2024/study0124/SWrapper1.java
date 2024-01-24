package january2024.study0124;

public class SWrapper1 extends Kingteger{

	SWrapper1(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		double num1 = 2.2;
		Double dObj1 = 3.3;
		Double dObj2 = 4.4;
		String str1 = "123";
		String str2 = "123";
		Integer iObj = new Integer(10);
		Kingteger a = new Kingteger(10);
		Kingteger b = new Kingteger(10);
		System.out.println(num);
		System.out.println(iObj);
		System.out.println(a);
		int wer = parseKint(str1) + parseKint(str2);
		
		System.out.print("(double)iObj : " + iObj.doubleValue() +"\t"); //auto unboxing
		System.out.print("dObj2 : " + dObj2+ "\t");
		System.out.print("(int)dObj2 : " + dObj2.intValue()+ "\t");
		int num2 =iObj;
		System.out.println("Auto Boxing - iObj : " + num2 + "\t");
		Integer I1 = 10;
		I1++;  // new Integer(I1.intValue() + 1)   Because	Integer class is final class	
		I1+=3;  // new Integer(I1.intValue() + 3)
		int r = I1 +5;  // int r =Integer I1 = new Integer(I1.intValue() + 5).valueInt();
		Integer rObj = I1 -5; //new Integer(I1.intValue() - 5)
		int ppp = a.intValue();
		Number[] numberarr = {new Integer(20), new Double(3.14)};
		double sum =0;
		for(Number nb : numberarr) {
			sum += nb.doubleValue();
		}
		System.out.println(sum);
		System.out.println(a.add(b));
		System.out.println(a.add(3));
		System.out.println(a.add(5.3f));
		System.out.println(a.add(18.34));
		
	}
}
	 class Kingteger extends Number{
		int num;
		Kingteger(int num){
			this.num = num;
		}
		public String toString() {
			return String.valueOf(num);
		}
		public static int parseKint(int num) {
			return Integer.parseInt(String.valueOf(num));
		}
		public static int parseKint(String num) {
			return Integer.parseInt(String.valueOf(num));
		}
		@Override
		public int intValue() {
			return (int) num;
		}
		@Override
		public long longValue() {
			return (long) num;
		}
		@Override
		public float floatValue() {
			return (float) num;
		}
		@Override
		public double doubleValue() {
			return (double) num;
			// TODO Auto-generated method stub
		}
		 public static Kingteger valueOf(int value) {
		        return new Kingteger(value);
		    }
		 public Kingteger add(Kingteger other) {
		        return new Kingteger(this.num + other.num);
		    }
		 public Kingteger add(int other) {
			 return new Kingteger(this.num + other);
		 }
		 public Kingteger add(double other) {
			 return new Kingteger(this.num + (int)other);
		 }
		 public Kingteger add(long other) {
			 return new Kingteger(this.num + (int)other);
		 }
	}