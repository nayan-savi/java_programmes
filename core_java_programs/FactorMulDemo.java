
class FactorMulDemo{

	public static void main(String[] a){
		int num1 = 5, num2=4;
		int fact3 = getFactor(num1);
		int fact4 = getFactor(num2);
		int mul = fact3*fact4;

		System.out.println("3!*4! = "+mul);
	}

	static int getFactor(int num){
		int sum=1;
		for(int i=num;i>0;i--){
			sum *= i;
		}
		return sum;
	}

}