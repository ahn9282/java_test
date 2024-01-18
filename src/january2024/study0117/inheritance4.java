package january2024.study0117;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int pixel;

	public ColorTV(int size, int pixel) {
		super(size);
		this.pixel = pixel;

	}

	public void printProperty() {
		System.out.println(getSize() + "인치 " + getPixel() + "컬러");
	}

	protected int getPixel() {
		return pixel;
	}
}

class smartColorTV extends ColorTV {
	String phone;
	int pixel;

	public smartColorTV(int size, int pixel, String phone) {
		super(size, pixel);
		this.pixel = pixel;
		this.phone = phone;

	}

	public void printProperty() {
		System.out.println(getSize() + "인치, " + pixel + "컬러, " + "연결된 폰 : " + phone);
	}
}

class IPTV extends ColorTV {
	String ip;

	public IPTV(String ip, int size, int pixel) {
		super(size, pixel);
		this.ip = ip;
		System.out.println(size + " " + ip + " " + pixel);
	} 

	public void printProperty() {
		System.out.print("나의 IpTV는 " + ip + "주소에 " );
		super.printProperty();
	}
}


public class inheritance4 {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		smartColorTV newTv = new smartColorTV(32, 1092, "galaxy");
		myTV.printProperty();
		newTv.printProperty();
		IPTV myipTV = new IPTV("192.1.1.2", 32, 2048);
		myipTV.printProperty();
		System.out.println(newTv.getSize());//뉴티비는 스마트칼라티비 > 칼라티비 > 티비 이렇게 상속관계니까 그냥 사용가능
	}
}
