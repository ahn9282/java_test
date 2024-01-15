package java_study0108;

public class ClassA {
	public static void main(String[] args) {
	Gugu gugu = new Gugu();
	gugu.printGugu(10);
	gugu.printGugu(20);
	
}}
class Gugu{
	public Gugu() {
		
	}
	public void printGugu(int num) {
		for(int i =1 ; i<=num;i++) {
			for(int j =1; j<=9;j++) {
				System.out.println(i + " * " + j + " = " + (i *j));
			}
		}
	}
}
