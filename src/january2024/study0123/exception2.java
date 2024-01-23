package january2024.study0123;


public class exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			md1(3);
		}catch(Throwable e){
			e.printStackTrace();
			System.out.println("0으로 나눠져? instead of 1");
			md2(3,1);
		}
		System.out.println("Good Bye~!");
	}
	public static void md1(int n) {
		md2(2,0);
	}
	public static void md2(int n1, int n2) {
		int r = n1/n2;
		System.out.println(r);
	}
}
