import java.util.LinkedHashSet;
import java.util.ArrayList;

class LinkedHashSetDemo{

	public static void main(String[] args){

		LinkedHashSet hs = new LinkedHashSet(10);

		System.out.println(hs.size());
		System.out.println(hs.isEmpty());

		hs.add("Apple");
		hs.add("Android");
		hs.add(20);
		System.out.println(hs);

		hs.remove("Apple");
		System.out.println(hs);	

		System.out.println(hs.contains("Apple"));

		hs.add("Apple");
		hs.add(20);
		System.out.println(hs);

		hs.clear();
		System.out.println(hs);

		LinkedHashSet hsl = new LinkedHashSet();
		hsl.add("iphone");
		hsl.add("blackberry");
		hsl.add("droid");
		System.out.println(hsl);

		hs.addAll(hsl);
		System.out.println(hs);

		ArrayList al = new ArrayList();
		al.add("Apple");
		al.add("Android");

		hs.addAll(al);
		System.out.println(al);
		System.out.println(hs);

		al.set(0,"windows");
		System.out.println(al);
		hs.addAll(al);
		System.out.println(hs);

	}
}