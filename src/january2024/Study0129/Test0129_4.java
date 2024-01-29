package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0129_4 {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
	
			Scanner sc = new Scanner(System.in);
			System.out.print("학점 입력 :");
			for (int i = 1; i <= 6; i++) {
				String c = sc.next();
				if (c.equals("A")) {
					list.add(4.0);
				} else if (c.equals("B")) {
					list.add(3.0);
				} else if (c.equals("C")) {
					list.add(2.0);
				} else if (c.equals("D")) {
					list.add(1.0);
				} else if (c.equals("F")) {
					list.add(0.0);
				} else {
					System.out.println("제대로 다시 입력하세요");
					i--;
					continue;
				}
			}
		
		System.out.println();
		double sum = 0;
		for (Double d : list) {
			sum += d;
		}
		double avg = sum / (double) list.size();
		System.out.println("평균 : " + avg);
	}
}