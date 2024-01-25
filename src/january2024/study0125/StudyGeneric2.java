package january2024.study0125;

public class StudyGeneric2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBox<String, Integer> box = new DBox<>();
		DBox<Apple, Orange> fbox = new DBox<>();
		fbox.set(new Apple(), new Orange());
		box.set("Apple", 25);
		System.out.println(box);
		System.out.println(fbox);
	}
}
class DBox<L, R>{
	private L left;
	private R right;
	public void set(L o, R r) {
		left =o;
		right = r;
	}
	public String toString() {
		return left + " & " + right;
	}
}