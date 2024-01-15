package edu.sejong.s0109;

public class ex1 {

	public static void main(String[] args) {
		Grade a = new Grade();
		System.out.println("값 확인" + a.eng + a.math + a.sic);
		a.initGrade(90, 70, 60);
		System.out.println(a.getAvg());
		System.out.println(a.getGrade());
	}

}
class Grade{
	int eng;
	int math;
	int sic;
	public Grade() {
		
	}
	public void initGrade(int a, int b, int c) {
		this.eng = a;
		this.math = b;
		this.sic = c;
		
	}
	public double getAvg() {
		return (eng + math + sic) / 3.0;
	}
	public String getGrade(){
		String str ;
		if(getAvg() >= 90) {
			str ="수 입니다.";
		}else if(getAvg() >= 80) {
			str ="수 입니다.";
		}else{
			str ="더 공부하셈";
		}
		return str;
	}
}