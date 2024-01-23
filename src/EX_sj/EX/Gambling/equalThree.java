package EX_sj.EX.Gambling;

public class equalThree extends Person2{
	private int[] arr= new int[3];
	private boolean w=true;
	public equalThree(String name) {
		super(name);
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*3)+1;
			System.out.print(arr[i] + " ");
			if(arr[1] == arr[2] && arr[0] == arr[2]) {
				setWL(w);
			}}
			showResult();
		
	}
}
