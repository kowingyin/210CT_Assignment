/**
 * 
 */
package assignment.Week4;

/**
 * @author ko
 *
 */
public class TestQueue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		System.out.println("queue empty : "+ q.empty());
		System.out.println("enqueue : "+ q.enqueue("apple"));
		System.out.println("enqueue : "+ q.enqueue("bibi"));
		System.out.println("enqueue : "+ q.enqueue("cece"));
		System.out.println("Queue after enqueue : "+q);
		System.out.println("Queue size : "+q.size());
		System.out.println("peek Queue : "+q.peek());
		System.out.println("enqueue : "+ q.enqueue("dede"));
		System.out.println("enqueue : "+ q.enqueue("eeee"));
		System.out.println("Queue size : "+q.size());
		System.out.println("enqueue : "+ q.enqueue("fufu"));
		System.out.println("peek Queue : "+q.peek());
		System.out.println("Queue after enqueue : "+q);
		System.out.println("queue empty : "+ q.empty());
		System.out.println("dequeue : "+ q.dequeue());
		System.out.println("dequeue : "+ q.dequeue());
		System.out.println("peek Queue : "+q.peek());
		System.out.println("Queue after enqueue : "+q);
		System.out.println("queue empty : "+ q.empty());
		System.out.println("Queue size : "+q.size());
	}

}
