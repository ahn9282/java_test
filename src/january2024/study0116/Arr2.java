package january2024.study0116;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box[] ar = new Box[3];
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");

		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}}

	class Box {
		private String conts;

		Box(String conts) {
			this.conts = conts;
		}

		public String toString() {
			return conts;
		}
	}


