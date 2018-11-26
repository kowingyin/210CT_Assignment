/**
 * 
 */
package assignment.Week4;

import assignment.Week3.LinkedList;
import assignment.Week3.ListNode;
/**
 * @author ko
 *
 */
public class Queue {
	LinkedList LL;
	
	public Queue(){//constructor
		LL = new LinkedList();//composing a LinkedList object
	}
	
	public boolean empty(){//return if the queue empty
		return LL.isEmpty();
	}
	
	public Object enqueue(Object o){
		LL.addToTail(o);
		return o;
	}
	
	public Object dequeue(){
		return LL.removeFromHead();
	}
	
	public Object peek(){//return list node at first position of the queue
		Object o=((ListNode) LL.removeFromHead()).getData();
		LL.addToHead(o);
		return o;
	}
	
	public int size(){//return the size of the queue
		assignment.Week3.ListNode node = LL.getHead();
		int i = 0;
		while(node!=null){
			node = node.getNext();
			i++;
		}
		return i; 
	}
	
	public String toString(){//print all data in queue
		return LL.toString();
	}
}
