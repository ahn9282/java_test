package january2024.study0116;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A[] arr = new A[5];
		System.out.println(arr.length);
		
		arr[0]= new A();
		arr[1]= new A();
		
		System.out.println(arr[0]);
	}

}
class A{
	public A() {
		System.out.println("객체가 생성되었습니다.");
	}
	public String toString() {
		System.out.println(" 이것이 나옵니다.");
		return "오버라이딩 되었음";
	}
}
