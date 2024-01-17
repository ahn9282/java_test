package january2024.java_study0109;

import java.util.Scanner;

public class Study0109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TV myTV =new TV("LG",2017,32);
//		myTV.show();
//		myTV.objShow(myTV);
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> "); int math = sc.nextInt();
		 * int sic = sc.nextInt(); int eng = sc.nextInt();
		 * 
		 * Grade me = new Grade(math, sic, eng);
		 * 
		 * sc.close();
		 */
		 
		Grade me = new Grade(90,80,80);
		System.out.println("평균은 " + me.avg());
		System.out.println(me.getGrade());
	}

}


class TV{
	String name;
	int year;
	int inch;
	public TV(String name, int year, int inch) {
		super();
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(name + "에서 만든 " + year + "년 " + inch + "인치");
	}
	public void objShow(TV sd) {
		System.out.println(sd.name + "에서 만든 " + sd.year + "년 " + sd.inch + "인치");
	}
	
}
class Grade{
	int math;
	int sic;
	int eng;
	
	public Grade(int math, int sic, int eng) {
		super();
		this.math = math;
		this.sic = sic;
		this.eng = eng;
	}
	public double avg()
	{
		return (math + eng + sic) / 3.0;
	}	
	public String getGrade() {
		String str = "";
		if(avg() >= 90) {
			str = "수 입니다.";
		}else if(avg() >= 80) {
			str = "우 입니다.";
		}else {
			str = "공부를 더하자";
		}
		return str;
	}
}

