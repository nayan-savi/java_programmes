interface MyInt{
	void m1();
	
	abstract void m2();

}
 class MyIntClass implements MyInt{

	public void m1(){
		System.out.println("----m3-------");

	}
	

	
	public void m2(){
		System.out.println("----m2-------");

	}
	

}
 class MyIntClassA implements MyInt{

	public void m1(){
		System.out.println("----m3  A-------");

	}
	

	
	public void m2(){
		System.out.println("----m2  B-------");

	}
	

}


class InterfaceDemo{
	public static void main(String args[]){

		MyIntClass m=  new MyIntClass();
		m.m1();

		MyIntClassA m1=  new MyIntClassA();
		m1.m1();

		MyInt my =new MyIntClass();
		my.m1();
	}
}