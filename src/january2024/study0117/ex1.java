package january2024.study0117;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box[] ar = new Box[5];
		ar[0] = new Box(101, "Coffee");
		ar[1] = new Box(202, " Computer");
		ar[2] = new Box(303, "Apple");
		ar[3] = new Box(404, "Dress");
		ar[4] = new Box(505, " Fairy-tale book");
		
		for(Box e : ar) {
			if(e.getboxNum()==505) {
			System.out.println(e);
		}}
	}

}
class Box{
	private int num;
	private String item;
	public Box(int num, String item) {
		this.num=num;
		this.item = item;
		getboxNum();
		toString();
	}
	public String toString() {
		return item;
	}
	int getboxNum() {
		return num;
	}
}
