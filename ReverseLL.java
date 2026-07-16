import java.util.*;
public class ReverseLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }



    void reverse(){
        Node prev=null;
        Node temp=head;
        Node next=null;

        while(temp!=null){
            next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next; 
        }
        head=prev;
    }
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.display();
        list.reverse();
        list.display(); 

    }
}
