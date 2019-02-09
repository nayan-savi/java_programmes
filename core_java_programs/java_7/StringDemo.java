class StringDemo{

	public static void main(String[] args){
		String s1 = new String();
		String s2 = new String("Hello SRM");
		char[] ch = {'w','e','l','c','o','m','e'};
		String s3 = new String(ch);
		String s4 = new String(ch,0,4);
		String s5 = "ravi";


		System.out.println(s1.isEmpty());
		System.out.println(s2);
		System.out.println(s3.isEmpty());
		System.out.println(s4);
		System.out.println(s5);
	}

}