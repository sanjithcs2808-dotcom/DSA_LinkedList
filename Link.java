public class Link {
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public class SinglyLL{
        Node head=null;
        void insertatbegin(int d){
            Node newnode=new Node(d);
            if(head==null)
                head=newnode;
            else{
                newnode.next=head;
                head=newnode;
            }
        }

        void insertatend(int d){
            Node newnode=new Node(d);
            if(head==null)
                head=newnode;
            else{
                Node temp=head;
                while(temp.next!=null)
                    temp=temp.next;
                temp.next=newnode;
            }
        }

        void deleteatbegin(){
            if(head==null)
                System.out.println("Empty List");
            else
                head=head.next;
        }

        void deleteatend(){
            if(head==null)
                System.out.println("Empty List");
            else{
                Node pre=null;
                Node temp=head;
                while(temp.next!=null){
                    pre=temp;
                    temp=temp.next;
                    }
                pre.next=null;
            }
        }

        void traverse(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
    }
}
    public static void main(String[] args){
        Link link = new Link();              // Create outer class object
        SinglyLL list = link.new SinglyLL();
        list.insertatbegin(5);
        list.insertatbegin(10);
        list.insertatbegin(15);


        list.display();
        }
}