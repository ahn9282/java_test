package january2024.Study0129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class StudyListIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Toy","box", "Robot", "box");
		list = new ArrayList<>(list);
		
		ListIterator<String> litr = list.listIterator();
		
		String str = null;
		while(litr.hasNext()) {
			str = litr.next();
			System.out.print(str + '\t');
			if(str.equals("Toy"))
				litr.add("Toy2");
			
		}
		System.out.println();
		while(litr.hasPrevious()) {
			str = litr.previous();
			System.out.print(str + '\t');
			if(str.equals("Robot"))
				litr.add("Robot2");
		}
		System.out.println();
		while(litr.hasNext()) {
			if(str.equals("Toy"))
				litr.add("Toy2");
			str = litr.next();
			System.out.print(str + '\t');
			
		}
		System.out.println();
	}

}
