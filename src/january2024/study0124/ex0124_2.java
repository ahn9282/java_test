package january2024.study0124;

import java.util.Scanner;

public class ex0124_2 {

	public static void main(String[] args) {
		Student me = new Student("김다정", 20, "서울시 관악구", "동서양대학교", "전산학과", 2013222);
	}

}

class Person {
	int age;
	String name;
	String address;

	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

		System.out.println("이름 :  " + name);
		System.out.println("나이 :  " + age);
		System.out.println();
		System.out.println("주소:  " + address);
	}

}

class Student extends Person {
	String school;
	String major;
	int classnum;
	double avg;
	Scanner sc = new Scanner(System.in);

	Student(String name, int age, String address, String school, String major, int classnum) {
		super(name, age, address);
		this.school = school;
		this.major = major;
		this.classnum = classnum;
		System.out.println("학교 :  " + school);
		System.out.println("학과:  " + major);
		System.out.println("학번:  " + classnum);
		System.out.println("----------------------------------------------");
		System.out.println("8학기 총 평균 평점은 " + average() / 8.0 + "점 입니다.");
	}

	double average() {
		double[] arr = new double[8];
		double sum = 0;
		for (int i = 0; i < 8; i++) {
			System.out.print((i + 1) + "학기 학점 → ");
			arr[i] = sc.nextDouble();
			sum += arr[i];
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();

		return sum;
	}
}