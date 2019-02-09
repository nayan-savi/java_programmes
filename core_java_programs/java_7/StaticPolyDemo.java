class Multiple{
	void mul(int i, int j){
		System.out.println(i*j);

	}

	void mul(int i, int j, int k){
		System.out.println(i*j*k);

	}

}
public class StaticPolyDemo{
	public static void main(String[] a){
		Multiple m1  = new Multiple();
		m1.mul(3,4);
		m1.mul(3,4,5);
	}
}