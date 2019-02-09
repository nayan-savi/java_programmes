public class SwitchCaseDemo{

	public static void main(String args[]){
		int color='g';
		
		switch(color){
			case 'g':
				System.out.println("Green");
				
			case 'w':
				System.out.println("White");
				break;
			case 'b':
				System.out.println("Black");
				break;
			default:
				System.out.println("No color found");
				
		}
		
	}

}