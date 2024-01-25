package january2024.study0125;

public class StudyGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box aBox = new Box();
Box oBox = new Box();
Box xBox = new Box();
Box<Apple>a1Box = new Box<>();
a1Box.set(new Apple());
System.out.println(a1Box.get());

aBox.set(new Apple());
oBox.set(new Orange());
xBox.set("파인애플");

Apple ap = (Apple) aBox.get();
Orange og = (Orange) oBox.get();
System.out.println(xBox.get());System.out.println(ap);System.out.println(og);
	}

}
class Box<T>{
	private T ob;
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return ob;
	}
}
class Apple {
	public String toString() {return "I am an apple";}
	
}
class Orange {
	public String toString() {return "I am an orange";}
	
}