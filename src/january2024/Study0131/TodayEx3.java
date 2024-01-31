package january2024.Study0131;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TodayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		}}

class Person{
	String name;
	int age;
	Person(String s, int a){
		name = s;
		age= a;
	}
	public String toString() {
		return name + " " + age;
		
	}
	public boolean equals(Object ob) {
		if(this.age == ((Person)ob).age) {
			return true;
		}
		return false;
	}
	public int hashCode() {
		return age;
	}
}
