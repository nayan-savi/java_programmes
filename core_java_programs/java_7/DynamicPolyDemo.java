class One{
	
	void m1(){
		System.out.println("-------One-----");

	}	
	
}

class Two extends One{
	
	 public void m1(){
		System.out.println("-------Two-----");

	}	

	void m2(){
		System.out.println("-------Two Two-----");

	}
	
}


public class DynamicPolyDemo{
	public static void main(String[] args){
		/*One o = new One();
		o.m1();*/

		Two t = new Two();
		t.m1();

		//One o1 = new Two();
		//o1.m1();
		//o1.m2();

		//Two t1 = (Two)new One();
	}
}