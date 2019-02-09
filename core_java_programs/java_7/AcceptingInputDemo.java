import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AcceptingInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//try{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter Number1");
		String str1 = br.readLine();
		System.out.println("Enter Number2");
		String str2 = br.readLine();
		
		
		int i = Integer.parseInt(str1);
		int j = Integer.parseInt(str2);
		
		System.out.println("Sum = "+(i+j));
		}catch(NumberFormatException ne){
			System.out.println("Please Enter Numbers Only!!!!");
		}
	}

}
