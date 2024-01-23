package january2024.study0122;

interface printable {
	public abstract void print(String doc);
	 int PAPER_WIDTH = 90;
	int PAPER_HEIGHT = 100; 
	default void printCMYK(String doc) {
		
	} // default method of interface must have content("{...}")
}
interface ColorPrintable extends printable{
	void printCMYK(String doc);
}
class Prn990Drv implements ColorPrintable{
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("From MD-909 color ver");
		System.out.println(doc);
	}


		
	}


class SPrinterDriver implements printable {
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}

	public void use() {
		System.out.println("Please waiting for preparing print...");
	}
}

class LPrinterDriver implements printable {
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}

	public void use() {
		System.out.println("Please waiting for preparing print...");
	}
}

public class printerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doc = "This is a my print";
		printable prn = new SPrinterDriver();
		prn.print(doc);
		
		prn = new LPrinterDriver();
		prn.print(doc);
		
		ColorPrintable prn2 =new Prn990Drv();
		prn2.print("go : bw");
		prn2.printCMYK("go : color");
	}

}
