package january2024.Study0130;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class StudyTreeSet2 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
			ArrayList<String> list = new ArrayList<>(lst);
			
			for(String s : list)
				System.out.print(s.toString() + "\t");
			System.out.println();
			
			HashSet<String> set = new HashSet<>(list);
			
			list = new ArrayList<>(set);
			
			for(String s : list)
				System.out.print(s.toString() + '\t');
			System.out.println();
	}

}
