package january2024.Study0129;

import java.util.Iterator;
import java.util.LinkedList;

public class StudyIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>  list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next();
			System.out.println(n + "\t");
		}
		System.out.println();
	}

}
