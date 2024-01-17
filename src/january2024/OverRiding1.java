package january2024;

public class OverRiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("010-3232-22","ANDROID 2.0");
		phone myPhoneanother = new SmartPhone("010-3232-22","ANDROID 2.0");
		myPhone.playApp();
		myPhoneanother.showYou();
	}

}
class phone{
	protected String phoneNum;
	public phone(String num) {
		this.phoneNum = num;
	}
	public void showYou() {
		System.out.print("번호는 " + phoneNum);
	}
}
class SmartPhone extends phone{
	private String osver;
	public SmartPhone(String num, String ver) {
		super(num);
		this.osver = ver;
	}
	public void playApp() {
		showYou();
		System.out.println(" App is reunning in " + osver);
	}
	public void showYou() {
		System.out.print("User의 번호는 " + phoneNum);
	}
}
