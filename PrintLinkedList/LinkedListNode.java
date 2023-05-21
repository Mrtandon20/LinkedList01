public class LinkedListNode {

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next = node2;
        Node<Integer> node3 = new Node<Integer>(30);
        node2.next = node3;
        Node<Integer> node4 = new Node<Integer>(40);
        node3.next = node4;
        node4.next = null;

        Node<Integer> head = node1;
        print(head);


   }
    
}
