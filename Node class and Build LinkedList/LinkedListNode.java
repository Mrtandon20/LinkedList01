public class LinkedListNode {

    public static void main(String[] args) {
        
        Node<Integer> node1 = new Node<Integer>(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node<Integer> node2 = new Node<Integer>(20);
        System.out.println(node2.data);
        System.out.println(node2.next);

        node1.next = node2;

        System.out.println(node1.next);
        System.out.println(node2);


   }
    
}
