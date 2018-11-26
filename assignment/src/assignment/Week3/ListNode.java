/**
 * 
 */
package assignment.Week3;

/**
 * @author ko
 *
 */

public class ListNode {
	private Object data;
	private ListNode next;
	public ListNode(Object o) { data = o; next = null; }
	public ListNode(Object o, ListNode nextNode) { data = o; next = nextNode; }
	public Object getData() { return data; }
	public ListNode getNext() { return next; }
	public void setData(Object data) {
		this.data = data;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public String toString() {
		return (String) getData();
	}
} // class ListNode