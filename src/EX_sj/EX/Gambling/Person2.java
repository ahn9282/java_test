package EX_sj.EX.Gambling;

import java.util.Scanner;

public class Person2  {
	private String name;
	private boolean wl ;
Scanner sc = new Scanner(System.in);
	public Person2() {
	};

	public Person2(String name) {
		this.name = name;
		this.wl = false;
		System.out.print("[" + name + "] : ");
		String start = sc.nextLine();
	
	}
	public void showResult() {
		if (wl) {
			System.out.println(" " + name + "님이 이겼습니다!");
		} else {
			System.out.println("아쉽군요!");
		}
	}
	boolean setWL(boolean w) {
		this.wl = w;
		return wl;
	}
	boolean getWL() {
		return wl;
	}
	

}
