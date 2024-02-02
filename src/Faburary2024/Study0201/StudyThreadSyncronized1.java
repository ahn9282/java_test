package Faburary2024.Study0201;

public class StudyThreadSyncronized1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new AccountThread();
		new Thread(r).start();
		new Thread(r).start();
	}

}

class Account{
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int money) throws Exception {
		if (balance >= money) {
			Thread.sleep(1000);
			balance  = balance- money;
		}
	}
}
class AccountThread implements Runnable{
	Account account = new Account();
	@Override
	public void run() {
		while(account.getBalance()>0) {
		int money = (int)(Math.random()*3 + 1) * 200;

		try {
		account.withdraw(money);
		System.out.println(account.getBalance());
		Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}
