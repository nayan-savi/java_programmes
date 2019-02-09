class IfEDemo{

	public static void main(String args[]){
		int a=8,b=9;
		if(a>b){
			System.out.println(a+" is greater than " +b);
		}else{
			System.out.println(a+" is smaller than " +b);
		}
	}
}
class NestedIfDemo{

	public static void main(String args[]){
		int a=8,b=9,c=10;
		if(a>b){
			if(b>c){
				System.out.println(a+" is greater than " +c);
			}
		}else{
			System.out.println(a+" is smaller than " +b);
		}
	}
}