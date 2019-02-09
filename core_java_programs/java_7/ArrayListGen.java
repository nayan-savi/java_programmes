import java.util.*;

class ArrayListGen{

	public static void main(String[] args){

		ArrayList<String> al = new ArrayList<String>(10);

		System.out.println(al.size());
		System.out.println(al.isEmpty());

		al.add("Apple");
		al.add("Android");
		al.add(23);
		
		System.out.println(al);
		
	}
}