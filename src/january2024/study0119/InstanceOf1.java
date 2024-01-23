package january2024.study0119;

public class InstanceOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		Box box3 = new GoldPaperBox();
		
		WrapBox(box1);
		WrapBox(box2);
		WrapBox(box3);
	}
	public static void WrapBox(Box box) {
		if(box instanceof GoldPaperBox) {
			System.out.println("this goldpaper");
			((GoldPaperBox)box).goldPaperWrap();
		}else if(box instanceof PaperBox) {
			System.out.println("this paper");
			((PaperBox)box).paperWrap();
		}else {
			System.out.println("this normal");
			box.simpleWrap();
		}
	}

}
class Box{
	public void simpleWrap() {
		System.out.println("Simple Wrapping");
	}
}
class PaperBox extends Box{
	public static void paperWrap() {
		System.out.println("Paper Wrapping");
	}
}
class GoldPaperBox extends Box{
	public static void goldPaperWrap() {
		System.out.println("Gold Wrapping");
	}
}