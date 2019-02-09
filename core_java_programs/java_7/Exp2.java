class Exp2{
	public static void main(String[] a){
		int x = 10,y=0;
		try{
		System.out.println(x/y);

		try{

			int z =0;
			System.out.println(x/y/z);
		}catch(Exception e){
			System.out.println("Trying to divide by zero in inner Try");
		}
		}catch(Exception e){

			System.out.println(e.getMessage());
			//System.out.println(e.printStackTrace());
			//System.out.println(e.getCause());
			System.out.println("Trying to divide by zero");
		}finally{

			System.out.println("Thank you");
		}
	}
}

