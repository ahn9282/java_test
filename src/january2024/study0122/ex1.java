package january2024.study0122;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fAry[] = {new Grape(), new Apple(), new Pear()};
     for(Fruit f : fAry) {
         f.print();
      }
	}

}
class Fruit{
	public void print() {
		
	}
}
class Grape extends Fruit{
public void print() {
		System.out.println("나는 포도다");
	}
}
class Apple extends Fruit{
public void print() {
	System.out.println("나는 사과다");
		
	}
}
class Pear extends Fruit{
public void print() {
	System.out.println("나는 배다");
		
	}
}