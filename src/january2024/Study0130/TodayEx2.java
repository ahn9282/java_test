package january2024.Study0130;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TodayEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		Iterator<String> itr = list.iterator();
		String n;
		while (itr.hasNext()) {
			n = itr.next();
			System.out.println(n);
		}
		for (String s : list) {
			System.out.print(s + "\t");
		}
		System.out.println();
		ListIterator<String> litr = list.listIterator();
		while (litr.hasNext()) {
			n = litr.next();
			System.out.println(n);
		}
		while (litr.hasPrevious()) {
			n = litr.previous();
			System.out.print(n + "\t");

		}
	}
}
