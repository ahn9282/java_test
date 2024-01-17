package january2024.java_study0110;

public class Rectangle1 {
	private int width;
	
	private int height;
	int getArea() {
		return width * height;
	}
	public Rectangle1() {
		
	}
public Rectangle1(int a, int b) {
		
		getHeight(a);
		getWidth(b);
		}
	public void getWidth(int width) {
		if (width < 0) {
			width = 0;
			return;
		}
		else {	
			this.width = width;
		}
	}
	
	public void getHeight(int height) {
		if (height < 0) {
			height = 0;
			return;
		}
		else {	
			this.height = height;
		}
	}
	
}

