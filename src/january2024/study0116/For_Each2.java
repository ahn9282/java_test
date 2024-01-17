package january2024.study0116;

public class For_Each2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		int sum = 0;
		for(int i : ar) {
			sum+=i;
			System.out.println(i +  " " + sum);
		}
			Box1[] arr = new Box1[5];
			arr[0] = new Box1(101, "Coffee");
			arr[1] = new Box1(202,"Apple");
			arr[2] = new Box1(303, "Computer");
			arr[3] = new Box1(404, "Dress");
			arr[4] = new Box1(505, "Fairy-tale book");
			
			for(Box1 e : arr) {
				if(e.getBox1Num()==505) {
					System.out.println(e + "굳");
				}
			}
			}	
	}


class Box1{
	int num;
	String name;
	 Box1(int num, String str){
		this.num = num;
		this.name= str;
		getname();
	}
	String getname() {
		return name;
	}
	int getBox1Num() {
		return num;
	}
	public String toString() {
		return name;
	}
}
