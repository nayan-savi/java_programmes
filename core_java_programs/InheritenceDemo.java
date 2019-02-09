class One{
	int x = 12;
	void m1(){
		System.out.println("x = "+x);
	}
}
class Two extends One{
	int y = 12;
	void m2(){
		System.out.println("y = "+y);
	}
	void m3(){
	System.out.println("x*y = "+x*y);
	}
}
class InheritenceDemo{
public static void main(String[] a){

		One o = new One();
		o.m1();
		//o.m2();

		Two t = new Two();
		t.m1();
		t.m2();
		t.m3();
	
}
}