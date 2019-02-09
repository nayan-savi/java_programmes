class MyRunnableThread implements Runnable{
	
	public MyRunnableThread() {
	}

	public void run(){
		System.out.println(Thread.currentThread().getName()+"Hello");
	}
	
}

public class MyRunnableThreadDemo{

	public static void main(String[] args) {
		MyRunnableThread  m = new MyRunnableThread();
		
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		Thread t4 = new Thread(m);
		Thread t5 = new Thread(m);
		Thread t6 = new Thread(m);

		t1.setPriority(10);
		t4.setPriority(9);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}