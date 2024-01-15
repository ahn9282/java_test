package Java_Study0112;


public class StringE2 {

	public static void main(String[] args) {
		String st1 = "Coffe";
		String st2 = "Bread";
		
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4);
		String season = "봄";
		switch(season) {
		case "봄":
			System.out.println("봄은 3, 4, 5월 입니다");
			
		case "여름":
			System.out.println("여름은 6, 7, 8월 입니다");
			
		case "가을":
			System.out.println("가을은 9, 10, 11월 입니다");
			
		case "겨울":
			System.out.println("겨울은 12, 1, 2월 입니다");
		default:
			System.out.println("이번 달은 " + season+ "이므로  3, 4, 5 중 하나입니다.");
		
		}
	}
}
