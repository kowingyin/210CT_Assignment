/**
 * 
 */
package assignment.Week4;

/**
 * @author ko
 *
 */
public class TestListStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStack ls = new ListStack();
		System.out.println("ListStack empty: "+ls.isEmpty());
		ls.push("123");
		ls.push("ken");
		ls.push("ivan");
		ls.push("asdf");
		ls.push("poiuy");
		System.out.println("ListStack after push sth : "+ls);
		System.out.println("push : "+ls.push("dream")+"  "+ls);
		System.out.println("pop : "+ls.pop()+"  "+ls);
		System.out.println("pop : "+ls.pop()+"  "+ls);
		System.out.println("push : "+ls.push("cocky")+"  "+ls);
		System.out.println("pop : "+ls.pop()+"  "+ls);
		System.out.println("ListStack after push and pop sth : "+ls);
		System.out.println("ListStack empty : "+ls.isEmpty());
		System.out.println("pop : "+ls.pop());
		System.out.println("ListStack after pop : "+ls);
		System.out.println("search '123' : " + ls.search("123"));
		System.out.println("search 'ken' : " + ls.search("ken"));
		System.out.println("search '333' : "+ls.search("333"));
		System.out.println("peek : "+ls.peek());
		System.out.println("push : "+ls.push("cocky")+"  "+ls);
		System.out.println("search 'ken' : " + ls.search("ken"));
		System.out.println("peek : "+ls.peek());
	}

}
