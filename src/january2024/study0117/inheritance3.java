package january2024.study0117;

public class inheritance3 {

	public static void main(String[] args) {
		SubCLS a = new SubCLS();
		SubCLS b = new SubCLS(2);
		SubCLS c = new SubCLS(3,5);
		
		
	}
}

class SuperCLS {
	public SuperCLS() {
		System.out.println("SuperCLS");
	}

	public SuperCLS(int i) {
		
		System.out.println("SuperCLS" + i);
	}

	public SuperCLS(int i, int j) {
		
		System.out.println("SuperCLS" + i + j);
	}
}
class SubCLS extends SuperCLS{
	   public SubCLS() {
		      System.out.println("SubCLS");
		   }

		   public SubCLS(int i) {
		      super(i);  // method overloading collectly
		      System.out.println("SubCLS + i");
		   }

		   public SubCLS(int i, int j) {
		      super(i, j); 
		      System.out.println("SubCLS" + i + j);
		   }
		}
