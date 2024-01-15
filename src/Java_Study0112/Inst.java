package Java_Study0112;


public class Inst {
	static int num=0;
	public Inst() {
	instNum();
	}
	public void instNum() {
		num+=1;
		System.out.println("인스턴스 생성 : " + num);
	}
}

