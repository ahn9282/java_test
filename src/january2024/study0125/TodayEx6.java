package january2024.study0125;

class DD1Box<T, R> {
	T q;
	R w;

	public void set(T o1, R o2) {
		this.q = o1;
		this.w = o2;
	}

	public String toString() {
		return q + "\n" + w;
	}
}

class D1Box<T, R>{
	T name;
	R num;
	D1Box(){
	}
	public void set(T a, R b) {
		this.name =a;
		this.num = b;
	}
	public String toString() {
		return name + " & " + num;
	}
}

public class TodayEx6 {

	public static void main(String[] args) {
		D1Box<String, Integer> box1 = new D1Box<>();
		box1.set("Apple", 25);

		D1Box<String, Integer> box2 = new D1Box<>();
		box2.set("Orange", 33);

		DD1Box<D1Box<String, Integer>, D1Box<String, Integer>> dD1Box = new DD1Box<>();
		dD1Box.set(box1, box2);

		System.out.println(dD1Box);
	}

}