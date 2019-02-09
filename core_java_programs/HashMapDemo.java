import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
class HashMapDemo{
	public static void main(String[] a){
		HashMap hm = new HashMap();
		
		hm.put("Dhroni",80);
		hm.put("sehwag",100);
		hm.put("sachin",70);
		hm.put("sachi",90);
		hm.put(null,null);
		System.out.println(hm);	

		System.out.println(hm.get("Sachin"));

		System.out.println(hm.containsValue(100));

		Set s = hm.keySet();
		System.out.println(s);

		Set s1 = hm.entrySet();
		System.out.println(s1);

		Collection s2=hm.values();
		System.out.println(s2);
	}
}