class Super{
	int i=10;

	static{
		System.out.println("-----Super Block-----");
	}

	
	Super(int j){
		System.out.println(j);
	}

	
	void m1(){
		System.out.println(i);

	}	
}
class Sub extends Super{
	int i=20;//variable overriding

	static{
		System.out.println("-----Sub Block-----");
	}

	Sub(){
		super(30);
	}
	
	void m1(){
		//System.out.println(super.m1());
		System.out.println(i);
		super.m1();
	}
}

public class SuperDemo{
	public static void main(String[] args){
		Sub sub = new Sub();
		sub.m1();
		Sub sub1= new Sub();
	}
}