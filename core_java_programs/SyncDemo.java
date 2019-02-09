class Buying implements Runnable{

	int order_items;
	int available_items =10;

	Buying(int order_items){
		this.order_items = order_items;
	}

	public  void  run(){
		synchronized(this){
		if(available_items>=order_items){
		try{
		
		System.out.println(Thread.currentThread().getName()+"has ordered "+order_items);
		Thread.sleep(5000);
		available_items = available_items-order_items;
		
		}catch(Exception e){}
		}else{
			System.out.println("Sorry!, No more items");
		}
		}
	}

	
}
class SyncDemo{
	public static void main(String args[]){

		Buying b= new Buying(10);
		
		Thread t1 = new Thread(b,"Cust1");
		Thread t2 = new Thread(b,"Cust2");

		t1.start();
		t2.start();
		
	}

}