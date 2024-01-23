package january2024.study0119;

public class ObjClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new kong();//Object class is able to polymorphism All other Class
		String str1 = "1234";
		String str2 = "4567";
		
		if(str1.equals(str2))System.out.println("맞음");
		else System.out.println("다름");
		int a =1;
		AAA aaa = new AAA();
		System.out.println(aaa);
	}

}
class AAA{
	public String toString() {
		return "안녕하세요";
	}
}

class kong{
	public kong() {
		System.out.println("콩");
		System.out.println(this);
	}
	
}
