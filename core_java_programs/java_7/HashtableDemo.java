import java.util.Hashtable;
import java.util.Set;
class HashtableDemo{
	public static void main(String[] a){
		Hashtable ht = new Hashtable();
		
		ht.put(1,100);
		ht.put("Dhroni",80);
		ht.put("sehwag",100);
		System.out.println(ht);	

		System.out.println(ht.get("Sachin"));

		Set s = ht.keySet();
		System.out.println(s);
	}
}