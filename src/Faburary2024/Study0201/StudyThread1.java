package Faburary2024.Study0201;

public class StudyThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicThread t = new MusicThread();

		Runnable r = new PlayerThread();
		Thread playerThread = new Thread(r);
		t.start();
		playerThread.start();
	}

}

class MusicThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}

	}
}

class PlayerThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}

	}
}
