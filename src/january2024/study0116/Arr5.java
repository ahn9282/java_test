package january2024.study0116;


public class Arr5 {

	public static void main(String[] args) {
		String[] arrstr = {new String("one"),
						new String("two"),
						new String("three")
						};
		int[] ar = {1,2,3,4,5,6,7,};
		int sum=sumOfAry(ar);
		int[] arrInt1 = new int[3];
		arrInt1[0] = 1;
		arrInt1[1] = 2;
		arrInt1[2] = 3;
		
		System.out.println(arrInt1[0]);
		System.out.println(arrInt1[1]);
		System.out.println(arrInt1[2]);
		System.out.println(arrstr[0]);
		System.out.println(arrstr[1]);
		System.out.println(arrstr[2]);
		}
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i = 0; i< ar.length;i++) {
			sum+=ar[i];
		}
		System.out.println(sum);
		return sum;
	}
	}


