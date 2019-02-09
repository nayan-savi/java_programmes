class Person{
	public static final String name = "SRM";
	public String address = "koramangala";

	public void courses(){
		System.out.println("java");
	}

}

public class PersonDemo{
	public static void main(String[] a){
		
		Person p1 = new Person();
		System.out.println("p1 created "+p1.name);
		Person p2 = new Person();
		System.out.println("p2 created");
		p2.name="sap";
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}