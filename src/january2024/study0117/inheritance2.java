package january2024.study0117;

public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuisnessMan me = new BuisnessMan("ahn", "eclipse", "supervisor");
		me.tellYourInfo();
		me.tellYourInfo(2);
}
}
class Man{
	String name;
	public void tellYourInfo() { 
        System.out.println("My name is " + name); 
    }
	public void tellYourInfo(int num) { 
        System.out.println("My name is " + name + " num " + num); 
    }

}
class BuisnessMan extends Man{
	String company;
	String position;
	
	public BuisnessMan(String name, String company, String position) {
		this.name= name;
		this.company=company;
		this.position = position;
	}
	public void tellYourInfo() {
		tellYourInfo();
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
	}
	public void tellYourInfo(int num) {
		tellYourInfo();
		System.out.println("My company is " + company + " " + num);
		System.out.println("My position is " + position);
	}
}