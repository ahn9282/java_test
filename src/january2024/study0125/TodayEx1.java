package january2024.study0125;

public class TodayEx1 {

	public static void main(String[] args) {
		Person p1 = new Person("Lee", 29);
		Person p2 = new Person("Lee", 29);

		Person p3 = new Person("Lee", 30);
		Person p4 = new Person("ahn", 30);

		System.out.println(p1.equals(p2)); // true
		System.out.println(p1.equals(p3)); // false
		System.out.println(p4.equals(p3));
		System.out.println(p1);
		Ktring k1 = new Ktring("sdd");
		Ktring k2 = new Ktring("sdd");
		Ktring k3 = new Ktring("asd");
		if (k1.equals(k2)) {
			System.out.println("동일");
		} else {
			System.out.println("다름");
		}
		if (k1.equals(k3)) {  

			System.out.println("동일");
		} else {
			System.out.println("다름");
		}
	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Person p) {
		if (p instanceof Person) {
			if (this.name == p.name && this.age == p.age) {
				return true;
			}

		}
		return false;
	}
	@Override
	public String toString() {
		return "name : ".concat(this.name).concat(" age : ").concat(String.valueOf(this.age));
	}
}

class Ktring {
	String cont;

	Ktring(String a) {
		this.cont = a;
	}

	Ktring() {
		this.cont = null;
	}

	public boolean equals(Ktring a) {
		if (a instanceof Ktring) {
			if (a.cont == this.cont)
				return true;
		}
		return false;
	}
	
}