package EX_sj.EX.Gambling;

import java.util.Scanner;

public class Person  {
	private String name;
	private boolean wl ;
	private int[] arr= new int[3];
Scanner sc = new Scanner(System.in);
	public Person(String name) {
		this.name = name;
		this.wl = false;
	showTurn();
	play();
	}
	public void showTurn() {
		System.out.print("[" + name + "] : ");
		String start = sc.nextLine();
	}
	public boolean showResult() {
		if (wl) {
			System.out.println(" " + name + "님이 이겼습니다!");
			return true;
		} else {
			System.out.println("아쉽군요!");
			return false;
		}
	}
	public void play() {
		 this.wl = false;
		 for(int i=0; i<3;i++) {
			 arr[i] = (int)(Math.random()*3) + 1;
			System.out.print(arr[i] + " ");
			 if(arr[0] == arr[1]&& arr[1] == arr[2]) {
				 wl = true;
			 }
		 }
	}
}
