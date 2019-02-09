public class ReverseNum{

	public static void main(String args[]){
		int num=125;int sum = 0;
		while(num>0){ 
			int num1 = num/10; 
			int rem = num%10;
			sum = sum*10+rem; 
			num = num1; 
		}
		System.out.println("Reverse = "+sum);
	}

}