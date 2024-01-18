package january2024.study0118;

public class polumorphism3 {
	public static void main(String[] args) {
	Fruit[] fAry = { new Grape(), new Apple(), new Pear() };
	

	for(Fruit f:fAry){
		f.print();
	}
}
}
class Fruit {
	void print() {
		System.out.println("나는 과일이다.");
	}
}

class Grape extends Fruit {
	void print() {
		System.out.println("나는 포도이다.");
	}
}

class Apple extends Fruit {
	void print() {
		System.out.println("나는 사과이다.");
	}
}

class Pear extends Fruit {
	void print(){
		System.out.println("나는 배다.");
	}
}
