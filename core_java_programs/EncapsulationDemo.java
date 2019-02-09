class Encapsulation{

public int i=10;
private static int j = 20;

int sum(){
System.out.println("sum = "+(i+j));
return (i+j);
}

public void getI(){
	System.out.println(i);
}

}
public class EncapsulationDemo{

public static void main(String a[]){
	Encapsulation e = new Encapsulation();
	//System.out.println(e.j);
	e.sum();
	e.getI();
}
}
