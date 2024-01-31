package january2024.Study0131;

import java.io.FileWriter;
import java.io.Writer;

public class StudyCharStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try (Writer out = new FileWriter("data.dat")){
	out.write('A');
	out.write('한');
	
}catch(Exception e) {
	e.printStackTrace();
}
	}

}
