package edu.sejong.s0109;

public class ex3 {

	public static void main(String[] args) {
		Tv tv = new Tv(20, "blue");
		System.out.println(tv.getSize()+ "인치 입니다");
		System.out.println(tv.getColor()+ "색상 입니다");
		
		tv.show();
	}
}
class Tv{
	int size;
	String color;
	public Tv(int a, String b) {
		this.size =a;
		this.color = b;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	public void show() {
		System.out.println(size + "인치 " + color + "색 입니다.");
	}
}