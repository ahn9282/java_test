package january2024.Study0131;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TodayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		System.out.println(map.get(45));
		System.out.println(map.get(37));
		System.out.println(map.get(23));
		
		Set<Integer> ks = map.keySet();
		for(int i : ks) {
			System.out.print(map.get(i)+ "\t");
		}
	}
}
