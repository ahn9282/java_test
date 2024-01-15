package Java_Study0112;

public class Stringbuilder1 {
	public static void main(String[] args) {
		StringBuilder stbld = new StringBuilder("123");

		stbld.append(45678);
		System.out.println(stbld.toString());

		stbld.delete(0, 2);
		System.out.println(stbld.toString());

		stbld.replace(0, 3, "AB");
		System.out.println(stbld.toString());

		stbld.reverse();
		System.out.println(stbld.toString());
		System.out.println(stbld);

		String sub = stbld.substring(2, 4);
		System.out.println(sub);
	}
}
