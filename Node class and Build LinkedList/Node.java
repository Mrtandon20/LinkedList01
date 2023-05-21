// Using genrics for linked list

public class Node<T>{

    T data;
    Node <T> next;
    // <T> means next node should be of same type

    Node(T data){
        this.data = data;
        next = null;
    }


}
