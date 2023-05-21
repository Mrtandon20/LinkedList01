import java.util.Scanner;

public class LinkedListNode {

    public static Node<Integer> Insert(Node<Integer> head, int pos, int data){
        Node<Integer> newNode = new Node<Integer>(data);
        if(head == null){
        return head;
        }
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }

        int count = 0;
        Node<Integer> temp = head;

        while(temp!=null && count<pos-1){
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


        return head;
        
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while(data!=-1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }

            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        
        // Node<Integer> node1 = new Node<Integer>(10);
        // Node<Integer> node2 = new Node<Integer>(20);
        // node1.next = node2;
        // Node<Integer> node3 = new Node<Integer>(30);
        // node2.next = node3;
        // Node<Integer> node4 = new Node<Integer>(40);
        // node3.next = node4;
        // node4.next = null;



        Node<Integer> head = takeInput();
        print(head);
        Insert(head, 3, 40);
        System.out.println("After Insert Function Linked list Looks Like : ");
        print(head);


   }
    
}
