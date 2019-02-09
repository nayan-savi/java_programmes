class Exp1{
	public static void main(String[] a){
		try{

		int x = 10,y=0;		
		System.out.println(x/y);
		System.out.println("sum "+(10+2));
		}catch(Exception e){
			//System.out.println("You are trying to divide a number by zero");
			System.out.println(10/1);
		}finally{
			System.out.println("Thanking You");
		}
	}
}

