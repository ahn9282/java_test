package january2024.study0126;

public class StudyGeneric1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box<String> sBox = BoxFactory.<String>makeBox("sweet");
Box<Double> dBox = BoxFactory.<Double>makeBox(2.13);
Box<Double> ddBox = BoxFactory.makeBox(2.13);
	}

}
class BoxFactory{
	public static <T> Box<T> makeBox(T o){
		Box<T> box = new Box<T>();
		box.set(o);
		return box;
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
