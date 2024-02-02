package Faburary2024.Study0202;

public class Ex0202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadL t1 = new ThreadL();
		ThreadW t2 = new ThreadW();
		t1.start();
		t2.start();
		
	}

}class ThreadL extends Thread{
	@Override
	public void run(){
		for(int i = 0;i<300;i++) {
			System.out.print("|");
		}
	}
}
class ThreadW extends Thread{
	@Override
	public void run(){
		for(int i = 0;i<300;i++) {
			System.out.print("-");
		}
	}
}

