class Customer{

	Customer(){
		System.out.println("No Registration");
	}
	
	Customer(String name,int phno){
		System.out.println("Registred with name and phno");
	}

	Customer(String name,int phno,String email){
		System.out.println("Registred with name and phno, email");
	}
	

}
class Shopping{

	Public static void main(String jhj[]){

		Customer c1 = new Customer();

		Customer c2 = new Customer("ram",1564);

		Customer c3  = new Customer("ram",1564,"ajj@gvhg.com");

	}

}