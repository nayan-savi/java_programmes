class StaticVar{
	static final int i = 10;
	int j;

	StaticVar(){
	}

	StaticVar(int k,int l){
	//i=k;
	j=l;
	}

}
public class StaticVarDemo{
	
	static final int i = 10;
	int j;

	public static void main (String[] args)
   	{
	StaticVar st = new StaticVar();
	System.out.println(StaticVar.i);
	System.out.println(j);

	StaticVar st1 = new StaticVar();
	//st1.i = 20;
	System.out.println(StaticVar.i);
	System.out.println(st1.j);

	System.out.println(StaticVar.i);
	}
}