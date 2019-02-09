import java.util.TreeSet;
import java.util.ArrayList;
import java.util.SortedSet;

class TreeSetDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		System.out.println(ts.size());
		System.out.println(ts.isEmpty());

		ts.add("Apple");
		ts.add("Android");
		System.out.println(ts);

		ts.remove("Apple");
		System.out.println(ts);	

		System.out.println(ts.contains("android"));

		ts.clear();
		System.out.println(ts);

		ts.add("windows");
		ts.add("iphone");
		ts.add("blackberry");
		ts.add("android");
		System.out.println(ts);

		SortedSet ss =ts.subSet("android","iphone");
		System.out.println(ss);
		//System.out.println(ts);
		
		SortedSet hs =ts.headSet("iphone");
		System.out.println(hs);
		//System.out.println(ts);

		SortedSet tss =ts.tailSet("blackberry");
		System.out.println(tss);
		//System.out.println(ts);

		System.out.println(ts.first());
		System.out.println(ts.last());

		System.out.println(ts.lower("windows"));
		System.out.println(ts.higher("windows"));

		System.out.println(ts.floor("iphone"));
		System.out.println(ts.ceiling("iphone"));

		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
	}
}