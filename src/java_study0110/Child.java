package java_study0110;

public class Child {
	private int age;
	private String name;
	
	public Child(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	void showInfo() {
		System.out.println("나이 : " + this.age);
		System.out.println("이름 : " + this.name);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			age = 0;
			return;
		}
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null) {
			this.name = "unknown";
			return;
		}else if(name.length()>=10) {
			this.name = "이름이 너무 깁니다.";
			return;
		}
		this.name = name;
	}
}
