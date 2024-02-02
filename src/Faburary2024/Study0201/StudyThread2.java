package Faburary2024.Study0201;

import javax.swing.JOptionPane;

public class StudyThread2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		inputThread in = new inputThread();
		CountThread cnt = new CountThread();
		in.start();// 0
		cnt.start();// 1 인덱스처럼 순차적으로 번호메기는듯
	}

}

class inputThread extends Thread {
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("아무 값 입력");
		System.out.println("입력 값 : " + input + "입니다.");
		setName(input + " Thread");
		System.out.println(Thread.currentThread().getName());
	}
}

class CountThread extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			if (i == 0)
				System.out.println("땡!");
			else
				System.out.println(i);
			try {
				Thread.sleep(1000);
				setName("CountThread " + i + "번째");
				System.out.println(Thread.currentThread().getName());
			} catch (Exception e) {

			}
		}
	}
}
