package january2024.study0123;

public class tex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";

	    // 삼성 프린터로 출력
	    Printable1 prn = new SPrinterDriver1();
	    prn.print(myDoc);

	    System.out.println();

	    // LG 프린터로 출력
	    prn = new LPrinterDriver1();
	    prn.print(myDoc);

		
	}

}
interface Printable1{
	public abstract void print(String doc);
	
}
class SPrinterDriver1 implements Printable1{
	@Override
	public void print(String doc) {
	System.out.println("삼성프린터");
	System.out.println(doc);
	}
}
class LPrinterDriver1 implements Printable1{
	@Override
	public void print(String doc) {
		System.out.println("엘지프린터");
		System.out.println(doc);
		
	}
}