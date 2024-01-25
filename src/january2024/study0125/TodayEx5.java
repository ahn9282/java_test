package january2024.study0125;

public class TodayEx5 {

	public static void main(String[] args) {
		double d1 = 1.2;
		System.out.println(d1%1);
				
		String sss = "00001";
	
		System.out.println(Integer.parseInt(sss));
		
		Person2 p1 = new Person2("lee", 29);
		Person2 p2 = new Person2("lee", 29);

		System.out.println(p1);

		if (p1.equals(p2))
			System.out.println("같은 사람");
		else
			System.out.println("다른 사람");
	}
}

class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}

	public boolean equals(Person2 a) {
		if ((this.name == a.name) && (this.age == a.age))
			return true;
		return false;
	}
}