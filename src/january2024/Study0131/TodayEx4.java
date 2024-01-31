package january2024.Study0131;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class TodayEx4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("data.dat"))){
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램");
		while (true) {
			System.out.print("이름 전화번호 >> ");
			String name = sc.nextLine();
			if(name.contentEquals("그만")) break;
					
				bw.write(name,0,name.length());
				bw.newLine();
				System.out.println("저장완료");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}}

