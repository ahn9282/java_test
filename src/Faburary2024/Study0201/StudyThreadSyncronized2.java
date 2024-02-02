package Faburary2024.Study0201;

public class StudyThreadSyncronized2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPrint sp = new StringPrint();
		Thread t1 =  new PrintThread("1번", sp);
		Thread t2 =  new PrintThread("2번", sp);
		Thread t3 =  new PrintThread("3번", sp);
		Thread t4 =  new PrintThread("4번", sp);
		Thread t5 =  new PrintThread("5번", sp);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
class PrintThread extends Thread{
	private StringPrint sp;
	private String str;
	public  PrintThread(String s, StringPrint sp) {
		this.str = s;
		this.sp = sp;
	}
	@Override
	public void run() {
		sp.display(str);
	}
	
}
class StringPrint{
	synchronized void display(String s) {
	for(int i =1; i<=2;i++) {
		System.out.print(Thread.currentThread().getName() + ":");
		System.out.println(s);
	}
	System.out.println();
	}
}