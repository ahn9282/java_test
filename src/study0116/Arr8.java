package study0116;


public class Arr8{

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0; i<100;i++) {
		int random = (int)(Math.random()*100) + 1;
		arr[i]=random;
		if(arr[i] %3 ==0)System.out.println(arr[i]);
		}
}
	}



