abstract class MyOne{

	abstract void m1();

}
class MyTwo extends MyOne{
	void m1(){
		System.out.println("----m1");
	}
}
class AbsrtactDemo{
	public static void main(String[] a){

		MyTwo o = new MyTwo();
	}
}