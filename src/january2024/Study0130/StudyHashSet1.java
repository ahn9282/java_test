package january2024.Study0130;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class INum1 {
	private int num;

	INum1(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	@Override
	public int hashCode() { 
		return num % 3; 
	}
	@Override
	public boolean equals(Object ob) {
		if(num == ((INum1)ob).num)  // if two instance's values is equaled, return true
			return true;
		else
			return false;
	}
}
public class StudyHashSet1 {

	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Set<INum1> nums = new HashSet<>();
				INum1 INum11 = new INum1(1);
				INum1 INum12 = new INum1(2);
				INum1 INum13 = new INum1(1);
				INum1 INum14 = new INum1(3);
				INum1 INum15 = new INum1(4);

				nums.add(INum11);
				nums.add(INum12);
				nums.add(INum13);
				nums.add(INum14);
				nums.add(INum15);
				
				System.out.println(nums);
			}

		}

	


