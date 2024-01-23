
public class jokbonote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Circle(10);
		System.out.println(obj);
	}

}
class Circle{
	private int radius; 
	Circle(int a){
		this.radius = a;
		
	}
	public String toString() {
		String str = ("출력 : 넓이는 " + String.format("%.3f",(radius * radius * Math.PI ))+ "입니다.");
		return str;
		
	}
}
