package january2024.study0122;
import java.util.Scanner;
abstract class Calc{
	protected int a;
	protected int b;
	public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
     }
     abstract int calculate();
}
class Add extends Calc{
	int num;
	public int calculate() {
		this.num = a+b;
		return num;
	}
}
class Sub extends Calc{
	int num;
	public int calculate() {
		this.num = a-b;
		return num;
	}
}
class Mul extends Calc{
	int num;
	public int calculate() {
		this.num = a*b;
		return num;
	}
}
class Div extends Calc{
	int num;
	public int calculate() {
		this.num = a/b;
		return num;
	}
}
public class abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int result=0;
	      System.out.print("두 정수와 연산자를 입력하시오 >> ");
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      char c = sc.next().charAt(0);
	      Calc cal;
	      switch(c) {
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("잘못된 연산자 입니다.");
	         sc.close();
	         return;
	      }
	      cal.setValue(a, b);
	      result = cal.calculate();
	      System.out.println(result);
	      sc.close();
	}
}