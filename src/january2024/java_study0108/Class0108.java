package january2024.java_study0108;
class AA{
	int count;
	int num;
	public int getNum() {
		return num;
	}
	public int getCount() {
		return count;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public AA() {
		System.out.println("안녕하세요. ");
	}
	public AA(int num, int count) {
		this.num = num;
		this.count = count;
	}
}

public class Class0108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA aa = new AA();
		System.out.println(aa.getNum());
		AA aa2 = new AA(5, 17); //생성자 : 자기가 가진 인스턴스 변수를 초기화 하기 위해 사용
		System.out.println(aa2.getNum());
		System.out.println(aa2.getCount());
		aa2.setNum(100);
		System.out.println(aa2.getNum());
	}

}
