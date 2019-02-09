import java.util.*;
class MyCollections{

	public static void main(String a[]){

		ArrayList al = new ArrayList();
		al.add("windows");
		al.add("iphone");
		al.add("blackberry");
		al.add("Android");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al,"Windows"));
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al));
	}
}