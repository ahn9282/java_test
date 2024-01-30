package january2024.Study0130;

import java.util.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class Person {
	private int age;
	private String name;
Person (String name, int age){
	this.name=name;
	this.age = age;
}

	@Override
	public String toString() {
		return name + " " + String.valueOf(age);
	}
@Override
public int hashCode() {
	return age + name.length();
}
public boolean equals(Object p) {
	if(this.hashCode() == ((Person)p).hashCode()) {
		return true;
	}return false;
}
}
public class StudyHashSet2 {

	
			public static void main(String[] args) {
				HashSet<Person> hSet = new HashSet<Person>();
				hSet.add(new Person("LEE", 10));
				hSet.add(new Person("LEE", 10));
				hSet.add(new Person("PARK", 35));
				hSet.add(new Person("PARK", 35));
				
				System.out.println("저장된 데이터 수 : " + hSet.size());
				System.out.println(hSet);
			}

		}

	


