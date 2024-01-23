package january2024.study0122;

public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Pet myPet = new DogPet();
 myPet.eat();
	}

}
abstract class Pet{//추상메서드가 클래스안에 있을 경우 클래스도 abstract로 선언된어야함
	abstract public void eat();//추상 클래스로는 객체 생성이 안됨
	public void run() {
		System.out.println("뛰어다닙니다.");
	}
}
class DogPet extends Pet{
	public void eat() {
		System.out.println("개가 밥을 먹엉");
	};
}