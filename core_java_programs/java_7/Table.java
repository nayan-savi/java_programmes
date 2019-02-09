import java.io.*;
public class Table{
	public static void main(String args[]){
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which table you want?");
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		for(int i=1; i<=10; i++){
			System.out.println(num1+" x "+i+" ="+(num1*i));
		}
		}catch(Exception  e){
			System.out.println("Please enter numbers only!!!");
		}
	}
}