package jav_study0111;

public class DverLoading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jung = new Person(335577, 112233);
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
		Person kim = new Person(35577, 112233, "김복순");
		kim.showPersonalInfo();
		Person ahn = new Person(0,2314);
		ahn.showPersonalInfo();

	}

}
class Person{
	private int regiNum;
	private int PassNum;
	private String name;
	
	Person(int rnum, int pnum){
		regiNum = rnum;
		PassNum = pnum;
	}
	Person(int rnum){
		this(rnum,0);
		showPersonalInfo();
	}
	Person(int rnum, int pnum,String str){
		regiNum = rnum;
		PassNum = pnum;
		name = str;
	}
	void showPersonalInfo(){
		System.out.println("주민등록번호 : " + regiNum);
		if(PassNum == 0) {
			System.out.println("여권이 없습니다.");
		}else {
			System.out.println("여권번호 : " + PassNum);
		}
		if(name  ==  null) {
			System.out.println("이름이 없습니다.");
		}else {
			System.out.println("이름 : "+ name);
		}
}
}