package january2024.Study0130;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodayEx1 {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
	System.out.print("정수(-1이 입력될 때까지) >> ");
	while(true) {
		try {
	Scanner sc =new Scanner(System.in);
	int num = sc.nextInt();
	if(num == -1) {
		break;
	}
	list.add(num);
	}catch(Exception e) {
		list = new ArrayList<>();
		continue;
	}
}
	int max =0;
	for(int i : list) {
	if(i > max) {
		max = i;
	}}
	System.out.println(max);
	}
}
