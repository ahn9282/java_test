package january2024.study0117;

public class inheritance5 {

	public static void main(String[] args) {
		BBB b = new BBB();
		
}}
class AAA{
	static int num = 12;
}
class BBB extends AAA{
	public BBB() {
		System.out.println(this.num);
		System.out.println(super.num);
		System.out.println(BBB.num);
	}
}
