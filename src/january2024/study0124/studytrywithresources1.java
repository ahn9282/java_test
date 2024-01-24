package january2024.study0124;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class studytrywithresources1 {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\tjqwn\\Simple.txt");


		try(BufferedWriter writer = Files.newBufferedWriter(file)) {
//객체 생성을 try의 매개변수로 넣음
//try구문을 빠져 나갈 때 안정적으로 자동 실행			

			writer.write('A');
			writer.write('Z');
			writer.write("sdasd");
			writer.write("야야야");
			writer.append("지지지지");

		} //writer.close();  try문이 끝나면 자동적으로 .close가 있는 객체의 경우 종료
		catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("종료로 마침");
			//if (writer != null) try {writer.close();} catch (IOException e) {}  
			//try(prameter){...}에 의해 의미 컴파일오류로 취급
				}
		}
	}

