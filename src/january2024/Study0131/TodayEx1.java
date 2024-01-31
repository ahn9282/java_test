package january2024.Study0131;

import java.util.HashSet;
import java.util.Set;

public class TodayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {

			set.add((int) (Math.random() * 45) + 1);
		}

		for (int i : set) {
			System.out.print(i + "\t");
		}

	}
}
