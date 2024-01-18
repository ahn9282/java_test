package january2024.study0118;

public class CoinCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoneyArr mArr = new MoneyArr(126000);
		mArr.show();
	}

}
class MoneyArr{
	int[] arr = {50000, 10000, 5000 , 1000, 500,100,50,10};
	int[] arr1 = new int[8];
	int money;
	MoneyArr(int money) {
		this.money =money;
		int m =money;
		for(int i =0; i <arr.length;i++) {
			arr1[i] = (m / arr[i]);
			m = m%arr[i];
		}}
		public void show() {
			for(int i =0; i <arr.length;i++) {
				System.out.println(arr[i] + "원 " + arr1[i] + "개");
			
		}
	}
}
