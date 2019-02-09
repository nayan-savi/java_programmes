class MathDemo{
	public static void main(String[] a){
		int x = 10;
		int y = 11;
		int z = -11;

		double i = 12.33;

		System.out.println(Math.E);
		System.out.println(Math.PI);

		System.out.println(Math.pow(i,2));
		System.out.println(Math.pow(i,6));


		System.out.println(Math.sqrt(2));
		System.out.println(Math.cbrt(2));

		System.out.println(Math.max(25,14));
		System.out.println(Math.max(25.54,14.56));
		System.out.println(Math.max(25.54,14));

		System.out.println(Math.min(25,14));
		System.out.println(Math.min(25.54,14.56));
		System.out.println(Math.min(25.54,14));

		System.out.println(Math.abs(y));
		System.out.println(Math.abs(z));

		System.out.println(Math.round(y));
		System.out.println(Math.round(i));

		System.out.println(Math.random());

		System.out.println(Math.floor(i));
		System.out.println(Math.ceil(i));

		
	}
}