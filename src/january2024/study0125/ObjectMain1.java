package january2024.study0125;

public class ObjectMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INum num1 = new INum(3);
		INum num2 = new INum(3);

		boolean b = num1.equals(num2);

		System.out.println(b);
	}

}

class INum {
	private int num;

	public INum(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof INum) {
			INum inum = (INum) obj;
			if (inum.num == this.num)
				return true;
		}
		return false;
	}
}
