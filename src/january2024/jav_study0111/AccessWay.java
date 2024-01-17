package january2024.jav_study0111;
class AccessWayClass {
	static int num = 0;
	
	AccessWayClass(){
		incrCnt();
	}
	void incrCnt() {
		num++;
	}
}
class AccessWay{
	public static void main(String[] args) {
		AccessWayClass acway = new AccessWayClass();
		acway.num++;
		AccessWayClass.num++;
		System.out.println(AccessWayClass.num);
	}
}
