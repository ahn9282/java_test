package java_study0115;


public class twelve2 {
	public static void main(String[] args) {
		StringBuilder stb = new StringBuilder();
		stb.append(34);
		System.out.println(stb.toString());
		System.out.println(stb);//sdsa
		///sadsa/
		Box box = new Box("camera");
		System.out.println(box.toString());
		System.out.println(box);
	}
}
 class Box{
	private String conts;
	
	Box (String conts){
		this.conts = conts;
		toString();
		
	}
	public String toString() {
		return conts;
	}
}