/**
 * 
 */
package assignment.Week6;

import assignment.Week5.BinarySearchTree;

/**
 * @author ko
 *
 */
public class TestBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree BST = new BinarySearchTree();
		int[] seq = new int[] {2, 7, 9, 4, 1, 5, 3, 6, 0 ,8};
		for(int i=0;i<seq.length;i++){
			BST.insert(seq[i]);
		}
		BST.inorder();
		BST.delete(2);
		BST.inorder();
	}
}
