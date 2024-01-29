package january2024.Study0129;

import java.util.ArrayList;


public class StudyList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.List<String> list = new ArrayList<>();
list.add("Toy");
list.add("Box");
list.add("Robot");
for(int i =0; i < list.size();i++) {
	System.out.print(list.get(i) + '\t');
}
	System.out.println();

list.remove(0);
for(int i= 0; i< list.size();i++) {
	System.out.print(list.get(i) + '\t');}
	System.out.println();

	}

}

