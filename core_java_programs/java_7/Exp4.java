class A{

	void m1() throws Exception 
        {
		System.out.println(5/0);	
	}	
}

class Exp4{
	public static void main(String[] a){

		try{
		A a1 = new A();
		a1.m1(); 
		}catch(Exception e){
			System.out.println("Exception in m1 while using A");
		}
		
	}
}

