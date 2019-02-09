class Exp3{
	public static void main(String[] a){
		int x = 10,y=0;
		try{
		System.out.println(a[0]);
		System.out.println(x/y);
		System.out.println(a[1]);
		
		}catch(ArrayIndexOutOfBoundsException e){

			System.out.println("Related to array");
		}catch(Exception e){

			System.out.println("Trying to divide by zero");
		}finally{

			System.out.println("Thank you");
		}
	}
}

