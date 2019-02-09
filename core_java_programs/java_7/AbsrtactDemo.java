abstract class One{

	public abstract void m1();
	public void m(){
		System.out.println("-------m---------");
	}
}

class Two extends One{
	public void m1(){
		System.out.println("-------m1 of Two---------");
	}
	

}

class Three extends One{
	public void m1(){
		System.out.println("-------m1 of Three---------");
	}
	

}

public class AbsrtactDemo{
	public static void main(String[] a){

		//One o = new One();
		Two t = new Two();
		t.m1();
		t.m();

		Three th = new Three();
		th.m1();
		th.m();
	}
}