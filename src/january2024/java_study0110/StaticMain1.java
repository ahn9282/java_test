package january2024.java_study0110;

public class StaticMain1 {

	public static void main(String[] args) {
		InstCnt cnt1;
		System.out.println(++InstCnt.instNum);
		// TODO Auto-generated method stub
//		InstCnt cnt1 = new InstCnt();
//		InstCnt cnt2 = new InstCnt();
//		InstCnt cnt3 = new InstCnt();
//		InstCnt.instNum++;
//		System.out.println("인스턴스 생성 : " + InstCnt.instNum);
//		System.out.println("인스턴스 생성 : " + cnt2.instNum++);
//		System.out.println("인스턴스 생성 : " + cnt1.instNum++);
//		System.out.println("인스턴스 생성 : " + cnt3.instNum);
	}

}
class InstCnt{
	static int instNum =0;
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성" + instNum);
	}
}

