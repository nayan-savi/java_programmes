import java.io.*;

public class FileWritingDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str = br.readLine();
		File f  = new File("123.txt");
		FileWriter fw = new FileWriter(f);
		String str1 = "Hello, Good Morning!!!!!";
		fw.write(str1);
		fw.append(str);
		fw.close();
	}

}
