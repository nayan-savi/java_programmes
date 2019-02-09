class Exp5 extends Exception{
	
	Exp5(String str){
	}

	void display(int i, int j)throws Exception{
		int x = i, y=j;

		if(x>y){
			System.out.println("x ="+x+" y ="+y);
		}else{
			
			Exp5 ex = new Exp5("My Exception");
			throw ex;
			//throw new Exception();
			
		}
	}

}

class Exp5Demo{
	public static void main(String a[]){

	Exp5 e = new Exp5("MyException");
	e.display(2,12);
	}

} 