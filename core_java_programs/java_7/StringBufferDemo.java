public class StringBufferDemo{
	public static void main(String[] a){

	StringBuffer sb = new StringBuffer("madam");
	System.out.println(sb);

	StringBuffer re = sb.reverse();
	System.out.println(re);

	if(sb.equals(re)){
		System.out.println("palindrome");
	}else{

		System.out.println("Not a palindrome");
	}

	}

}

