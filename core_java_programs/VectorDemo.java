import java.util.Vector;

class VectorDemo{

	public static void main(String[] args){

		Vector v = new Vector(10);

		System.out.println(v.size());
		System.out.println(v.isEmpty());

		v.add("Apple");
		v.add("Android");
		v.add(20);
		System.out.println(v);

		v.remove(2);
		System.out.println(v);	

		v.remove("Apple");
		System.out.println(v);	

		System.out.println(v.contains("Apple"));

		v.add("Apple");
		v.add(20);
		System.out.println(v);

		v.clear();
		System.out.println(v);

		v.add("windows");

		Vector vl = new Vector();
		vl.add("iphone");
		vl.add("blackberry");
		vl.add("droid");
		System.out.println(vl);

		v.addAll(vl);
		System.out.println(v);

		System.out.println(v.get(1));

		v.set(3,"Android");
		System.out.println(v.get(3));


	}
}