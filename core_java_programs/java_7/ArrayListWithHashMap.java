import java.util.*;

class ArrayListWithHashMap{

	static List<ArrayList<HashMap<String,Integer>>> al;

	public static void main(String[] args){

	al = buildData();

	System.out.println(al);

	}

	private static ArrayList<HashMap<String,Integer>> MybuildData(){
		ArrayList<HashMap<String,Integer>> al = new ArrayList<HashMap<String,Integer>>();
		HashMap hm1 = new HashMap();
		hm1.put("player1",100);
		al.add(hm1);
		HashMap hm2 = new HashMap();
		hm2.put("player2",90);
		al.add(hm2);
		return al;
	}

	private static List<ArrayList<HashMap<String,Integer>>> buildData(){
		List<ArrayList<HashMap<String,Integer>>> al = new ArrayList<ArrayList<HashMap<String,Integer>>>();
		ArrayList<HashMap<String,Integer>> all = MybuildData();
		al.add(all);
		ArrayList<HashMap<String,Integer>> al2 = MybuildData();
		al.add(al2);
		return al; 
	}
}