package Java_Study0112;

public class StirngE1 {

	public static void main(String[] args) {
		String str1 = "Simple Stirng";
		String str2 = "Simple Stirng";
		String str5 = "simple Stirng";
		String str6 = "가" + "나" + "다";
		System.out.println(str6);
		String str3 = new String("Simple String");// 대문자S
		String str4 = new String("Simple String");// 소문자s
		System.out.println();

		if (str3 == str1) {
			System.out.println("트루 입니다.");
		} else {
			System.out.println("폴스 입니다."); // str3와 str1은 내용은 같으나 참조 값 메모리주소가 다름
		} // 내용이 같은지 확인은 .equals()
		if (str5 == str1) {
			System.out.println("트루 입니다.");
		} else {
			System.out.println("폴스 입니다.");
		}
		if (str1 == str2) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		if (str3 == str4) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		int strin1 = str2.compareTo(str5);
		int strin2 = str5.compareTo(str2);
		System.out.println(strin1);
		System.out.println(strin2);
	}

}
