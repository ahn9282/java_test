package january2024.Study0131;

import java.io.BufferedReader;
import java.io.FileReader;

public class TodayEx5 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader("data.dat"))){
		 String str;
			while(true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}}

