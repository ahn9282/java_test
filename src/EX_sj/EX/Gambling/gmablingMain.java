package EX_sj.EX.Gambling;
import java.util.Scanner;

public class gmablingMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름 >> ");
		String name1 = sc.next();
		System.out.print("2번째 선수 이름 >> ");
		String name2 = sc.next();
		while (run) {
			Person player1 = new Person(name1);
			if(player1.showResult() ) {
				run=false;
				break;
			};
			Person player2 = new Person(name2);
			if(player2.showResult()) {
				run=false;
				continue;
			}
		};
	} 
}
