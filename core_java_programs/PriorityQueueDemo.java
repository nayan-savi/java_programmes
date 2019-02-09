import java.util.PriorityQueue;

class PriorityQueueDemo{
	public static void main(String a[]){
		PriorityQueue pq = new PriorityQueue(10);

		System.out.println(pq.size());

		pq.add("Windows");
		pq.add("iphone");
		pq.add("blackberry");
		pq.add("android");
		pq.add("apple");	
		System.out.println(pq);

		System.out.println(pq.peek());
		System.out.println(pq);

		System.out.println(pq.offer("windows"));
		System.out.println(pq);

		System.out.println(pq.poll());
		System.out.println(pq);

	}
}