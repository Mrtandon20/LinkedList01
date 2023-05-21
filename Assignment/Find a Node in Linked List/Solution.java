/****************************************************************

	Following is the class structure of the Node class:

	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;
    
    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
		if(head == null){
			return -1;
		}

		int count =0; 
		LinkedListNode<Integer> temp = head;
		while(temp !=null){
			if(temp.data == n){
				return count;
			}
			count++;
			temp = temp.next;
		}
		return -1;
	}
}
