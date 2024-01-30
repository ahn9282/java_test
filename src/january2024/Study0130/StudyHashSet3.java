package january2024.Study0130;

import java.util.HashSet;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num {
	int num;

	Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		if (num < 8000)
			return 0;
		else if (num < 10000)
			return 1;
		return 2;
	}

	public boolean equals(Object p) {
		if (this.num == ((Num) p).num) {
			return true;
		}
		return false;
	}
}

public class StudyHashSet3 {

	public static void main(String[] args) {

		HashSet<Num> set = new HashSet<>();
		set.add(new Num(7799));
		set.add(new Num(9955));
		set.add(new Num(7799));

		System.out.println("인스턴스 수: " + set.size());

		for (Num n : set)
			System.out.print(n.toString() + '\t');

		System.out.println();
	}
}
