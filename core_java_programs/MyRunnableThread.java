public class MyRunnableThread implements Runnable{
	
	public MyRunnableThread() {
	}

	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
	
}

class MyRunnableThradDemo{

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnableThread(), "thread1");
		Thread thread2 = new Thread(new MyRunnableThread(), "thread2");
		MyRunnableThread thread3 = new MyRunnableThread("thread3");
		//Start the threads
		thread1.start();
		thread2.start();
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread().getName());
	}

}