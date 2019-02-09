class InstanceVar{
	int i = 10;
	char j;
	String str;

	InstanceVar(){
	}

	InstanceVar(int k,int l){
	i=k;
	//j=l;
	}

}
public class InstanceVarDemo{
	public static void main (String[] args)
   	{
		/*InstanceVar ins1 = new InstanceVar(10,20);
		System.out.println("ins1 i = "+ins1.i);
		System.out.println("ins1 j = "+ins1.j);
		InstanceVar ins2 = new InstanceVar(50,60);
		System.out.println("ins2 i = "+ins2.i);
		System.out.println("ins2 j = "+ins2.j);*/
		InstanceVar ins3 = new InstanceVar();
		System.out.println("ins3 i = "+ins3.i);
		System.out.println("ins3 j = "+ins3.j);
		System.out.println("ins3 str = "+ins3.str);
	}
}