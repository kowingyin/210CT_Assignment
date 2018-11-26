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
public class ListStack extends LinkedList{//inheriting the LinkedList class
	
	public ListStack(){//constructor
		super();
	}
	
	public boolean Empty(){//check if the Stack is empty
		return isEmpty();
	}
	
	public Object pop(){//remove listnode from top and return it
		return removeFromHead();
	}
	
	public Object push(Object o){//push data
		addToHead(o);
		return o;
	}
	
	public int search(Object o){//search Object in liststack and return the index of the wanted object
		assignment.Week3.ListNode node = getHead();
		int i =1;
		while(node!=null){//iterate whole stack
			if(node.getData()==o){
				return i;
			}else{
				node = node.getNext();
				i++;
			}
		}
		return -1;
	}
	   
	public Object peek(){//return listnode on top
		Object o=((ListNode) removeFromHead()).getData();
		addToHead(o);
		return o;
	}
}
