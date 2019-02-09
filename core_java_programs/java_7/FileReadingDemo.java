import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadingDemo {

	public static void main(String[] args) throws IOException {
		
		String str;
		FileReader fr = new FileReader("study.txt");
		BufferedReader br = new BufferedReader(fr);
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
			
	}

}
