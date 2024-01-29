package january2024.Study0129;

class MyLinkedList{
	int num;
	MyLinkedList link;
}

public class StudyList3 {

	public static void main(String[] args) {
		MyLinkedList link1 = new MyLinkedList();
		MyLinkedList link2 = new MyLinkedList();
		MyLinkedList link3 = new MyLinkedList();
		link1.num = 1;
		link2.num = 2;
		link3.num = 3;
		link1.link = link2;
		link2.link = link3;
	}

}
