package EX_sj.EX.Gambling;

import java.util.Scanner;

public class gmablingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름 >> ");
		String name1 = sc.next();
		System.out.print("2번째 선수 이름 >> ");
		String name2 = sc.next();
		while (run) {
			equalThree player1 = new equalThree(name1);
			if(player1.getWL()) {
				run =false;
				break;
			}
			equalThree player2 = new equalThree(name2);
			if(player2.getWL()) {
				run =false;
				break;
			}
		}
	}
}
