class StringClassDemo{
	public static void main(String[] a){
		String s1 = new String();
		String s2 = new String("This is Java");
		char[] ch = {'s','r','m'};
		String s3 = new String(ch);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());

		if(s2.equals(s3)){
			System.out.println("s2=s3");
		}else{
			System.out.println("s2!=s3");
		}

		
		System.out.println(s3.startsWith("s"));

		System.out.println(s3.endsWith("m"));

		System.out.println(s2.indexOf('i'));
		
		System.out.println(s2.lastIndexOf("is"));
		
		System.out.println(s2.replace("is","es"));
		
		System.out.println(s2.replaceFirst("is","es"));

		System.out.println(s2.contains("is"));
	
		System.out.println(s2.toUpperCase());

		System.out.println(s2.toLowerCase());

		System.out.println(s2.substring(3,6));
		
		System.out.println(s2.substring(3));
		
		System.out.println(s2.concat(" ").concat(s3));

		String[] sp = s2.split(" ");
		for(int i=0; i<sp.length;i++){
			System.out.println(sp[i]);
		}

	}
}