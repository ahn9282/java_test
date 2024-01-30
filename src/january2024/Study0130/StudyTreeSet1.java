package january2024.Study0130;

import java.util.TreeSet;

public class StudyTreeSet1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
		      TreeSet<Integer> tree = new TreeSet<>();
		      tree.add(3);
		      tree.add(1);
		      tree.add(2);
		      tree.add(4);
		      tree.add(4);
		      System.out.println("인스턴스 수" + tree.size());
		      
		      for(int i : tree) {
		    	  System.out.print(i + "\t");
		      }
	}

}
