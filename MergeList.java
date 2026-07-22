public class MergeList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end of a list
    Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Merge two linked lists
    Node Merge(Node l1, Node l2) {
        if (l1 == null)
            return l2;

        Node temp = l1;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = l2;
        return l1;
    }

    // Display a list
    void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        MergeList ml = new MergeList();

        Node l1 = null;
        Node l2 = null;

        // First List
        l1 = ml.insertAtEnd(l1, 10);
        l1 = ml.insertAtEnd(l1, 20);
        l1 = ml.insertAtEnd(l1, 30);

        // Second List
        l2 = ml.insertAtEnd(l2, 40);
        l2 = ml.insertAtEnd(l2, 50);

        // Merge
        l1 = ml.Merge(l1, l2);

        // Display
        ml.display(l1);
    }
}