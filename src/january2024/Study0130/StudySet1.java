package january2024.Study0130;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudySet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Robot");
		set.add("Box");
		set.add("Box");
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Iterator<String> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
			System.out.println();
			for(String s : set)
				System.out.print(s + '\t');
			System.out.println();
		
	}

}
