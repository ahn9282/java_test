package january2024.java_study0109;

public class study0109_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ref1 = new BankAccount();// 새호운 메모리 주소로 초기화
		BankAccount ref2 = ref1;// ref1의 메모리 주소로 초기화 ref1과 같은 메모리 주소를 사용
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);
		ref1.checkMyAccount();
		ref2.checkMyAccount();
	}
}

class BankAccount {
	int balance = 0;

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {
		balance -= amount;
		return balance;

	}

	public int checkMyAccount() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
