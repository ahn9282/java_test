package january2024.Study0129;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudyList5 {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		boolean run = true;
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			try {
				int in = sc.nextInt();
				if (in > 0) {
				list.add(in);
				}else {break;}
			
			}catch(Exception e) {
				System.out.println("다시 하세여 제대로");
				list = new ArrayList<>();
				sc.nextLine();
				continue;
			}	
		}
		int max = 0;
		for (int num : list) {
		max = Integer.max(max,num);
		}
		System.out.println(max);
	}
}
