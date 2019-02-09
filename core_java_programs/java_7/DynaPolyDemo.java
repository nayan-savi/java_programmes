class NumSquare{
	public void square(int i){
		System.out.println(i*i);
	}
}
class NumCube extends NumSquare{
	public void square(int i){
		System.out.println(i*i*i);
	}
}
public class DynaPolyDemo{
	public static void main(String[] a){
		NumCube n  = new NumCube();
		n.square(2);
	}
}
