package assignment.Week3;

	class EmptyListException extends RuntimeException {
		public EmptyListException () { super ("List is empty"); }
	} // class EmptyListException
		
	public class LinkedList {
		 private ListNode head;
		 private ListNode tail;
		 public LinkedList() { head = tail = null; }
		 public boolean isEmpty() { return head == null; }
		 public ListNode getHead() {
			return head;
		}
		public void setHead(ListNode head) {
			this.head = head;
		}
		public ListNode getTail() {
			return tail;
		}
		public void setTail(ListNode tail) {
			this.tail = tail;
		}
		public void addToHead(Object item) {  
			ListNode node = new ListNode(item);// create node for new data
			if(isEmpty()){ //if linkedlist is empty, head=tail=new node
				head = node;
				tail = node;
			}else{//else put the new node before the old head and set new node as head
				node.setNext(head);
				head = node;
			}
		}

		public void addToTail(Object item) { 
			 ListNode node = new ListNode(item);// create node for new data
			 if(isEmpty()){//if linkedlist is empty, head=tail=new node
				 head = node;
				 tail = node;
			 }else{//else put the new node behind the old tail and set new node as tail
				 tail.setNext(node);
				 tail = node;
			 }
		}
		public Object removeFromHead() throws EmptyListException {
			Object node = head;//mark head as node
			ListNode node2 = head.getNext();//mark the second node as node2
			if(head == tail){//if only one node in linkedlist, head=tail=null
				head = null;
				tail = null;
			}else{
				head.setNext(null);//unlink the old head from linkedlist
				head = node2;//set the second node as head
			}
			return node;
		}
		 
		public Object removeFromTail() throws EmptyListException {
			 Object node = tail;
			 ListNode iter = head;//set the starting point as head to iterate
			 if(head == tail){//if only one node in linkedlist, head=tail=null
				head = null;
				tail = null;
			}else{
				while(iter.getNext().getNext()!=null){//find the node before last node
					iter = iter.getNext();
				}
				iter.setNext(null);//unlink the old tail from linkedlist
				tail = iter;//set the second last node as tail
			}
			return node;
		}
		 
		public String toString () {
			String s = "[ ";
			ListNode current = head;
			while (current != null) {
				s += current.getData() + " ";
				current = current.getNext();
			}
		return s + "]";
		}
	} // class LinkedList