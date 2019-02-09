import java.util.*;

class ArrayListDemo{

	public static void main(String[] args){

		ArrayList al = new ArrayList(10);

		System.out.println(al.size());
		System.out.println(al.isEmpty());

		al.add("Apple");
		al.add("Android");
		
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);	

		al.remove("Apple");
		System.out.println(al);	

		System.out.println(al.contains("Apple"));

		al.add("Apple");
		al.add(20);
		System.out.println(al);

		al.clear();
		System.out.println(al);

		al.add("windows");

		ArrayList all = new ArrayList();
		all.add("iphone");
		all.add("blackberry");
		all.add("droid");
		System.out.println(all);

		al.addAll(all);
		System.out.println(al);

		System.out.println(al.get(1));

		al.set(3,"Android");
		System.out.println(al.get(3));
		System.out.println(al);

		Object[] str =al.toArray();
		for(int i=0;i<str.length;i++){
		System.out.print(str[i]+"\t");
		}
		System.out.print(al.size());

	}
}