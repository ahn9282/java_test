package january2024.study0119;

class Friend {
	protected String name;
	protected String phone;

	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.print(" 이름 : " + name);
		System.out.print(" 번호 : " + phone);
	}
}

class CompFriend extends Friend {
	private String department;

	public CompFriend(String na, String ph, String dp) {
		super(na, ph);
		department = dp;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println(" 부서 : " + department);
	}
}
class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String na, String ph, String ma) {
		super(na, ph);
		major = ma;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
	}
}

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompFriend[] cpf = new CompFriend[5];
		int cpi =0;
		UnivFriend[] uvf = new UnivFriend[5];
		int uvi=0;
		
		
		cpf[cpi++] = new CompFriend("오종형", " 12313" ,"개발1");
		cpf[cpi++] = new CompFriend("육종혁", " 22313" ,"개발2");
		
		uvf[uvi++] = new UnivFriend("준", " 852" ,"컴공");
		uvf[uvi++] = new UnivFriend("섭", " 369" ,"전자공학");
		
		for(int i=0 ; i<cpi;i++) {
			cpf[i].showInfo();
		}
		for(int i=0 ; i<uvi;i++) {
			uvf[i].showInfo();
		}
	}

}
