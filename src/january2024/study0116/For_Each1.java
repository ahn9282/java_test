package january2024.study0116;

public class For_Each1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		int sum = 0;
		for(int i : ar) {
			sum+=i;
			System.out.println(i +  " " + sum);
		}
	}

}
