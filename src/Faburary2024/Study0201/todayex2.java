package Faburary2024.Study0201;

import java.io.BufferedReader;
import java.io.FileReader;

public class todayex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader in = new BufferedReader(new FileReader("data.dat"))){
			String str = "";
			while(true) {
				str = in.readLine();
				if(str == null)break;
				System.out.println(str);
				
			}
					
			
		}catch(Exception e) {
			
		}
	}

}
