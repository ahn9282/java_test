package january2024.Study0129;

import java.util.ArrayList;
import java.util.List;


public class StudyList4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int sum =0;
		
		for(int i = 1;i<=10;i++) {
			list.add(i );
		}
		list.add(20);
		for(int i =0; i < list.size();i++) {
			sum += list.get(i);
		}
		list.add(20);
		System.out.println(sum);
		
		for(int i =0; i < list.size();i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
	}	}

