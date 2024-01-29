package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0129_3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("숫자입력 : ");
				int num = sc.nextInt();
				if (num == -1) {
					break;
				}
				list.add(num);
			} catch (Exception e) {
				System.out.println("제대로 입력하세요");
				continue;
			}
		}
		int max = -1;
		for (int i : list) {
			max = (i > max) ? i : max;
		}
		System.out.println("max is " + max);
	}
}