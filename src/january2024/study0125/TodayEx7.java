package january2024.study0125;

public class TodayEx7 {

	public static void main(String[] args) {
		Boox<Integer> Boox1 = new Boox<>();
		Boox1.set(99);

		Boox<Integer> Boox2 = new Boox<>();
		Boox2.set(55);

		System.out.println(Boox1.get() + " & " + Boox2.get());
		swapBox(Boox1, Boox2);
		System.out.println(Boox1.get() + " & " + Boox2.get());

	}

	public static void swapBox(Boox a, Boox b) {
		Object temp = a.get();
		a.num = b.get();
		b.num = temp;
	}

}

class Boox<T> {
	T num;

	public void set(T a) {
		this.num = a;
	}

	public T get() {
		return num;
	}

}
