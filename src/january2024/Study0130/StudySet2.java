package january2024.Study0130;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class INum{
	private int num;
	INum(int num){
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}
public class StudySet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<INum> nums = new HashSet<>();
		INum inum1 = new INum(1);
		INum inum2 = new INum(2);
		INum inum3 = new INum(3);
		
		nums.add(inum1);
		nums.add(inum2);
		nums.add(inum3);
		
		System.out.println(nums);
		Set<Integer> set = new HashSet<>();
		int n =0;
		while(n < 6) {
		set.add((int)(Math.random()*45 )+1);
		n = set.size();
		}
		System.out.println("인스턴스 수 : " + set.size());
		
		for(Iterator<Integer> itr = set.iterator(); itr.hasNext();)
			System.out.print(itr.next() + "\t");
			System.out.println();
			
			for(int s : set)
				System.out.print(s + "\t");
			System.out.println();
		
	}

}
