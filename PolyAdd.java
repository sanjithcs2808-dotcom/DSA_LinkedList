class Node {
  int coef;
  int expo;
  Node next;

  Node(int coef, int expo){
      this.coef = coef;
      this.expo = expo;
      this.next = null;
  }
}

class LinkedList {
  Node head = null;

  void insertBegining(int coef, int expo){
      Node newNode = new Node(coef,expo);
      newNode.next = head;
      head = newNode;
  }

  void insertLast(int coef, int expo) {
      if(head == null){
          insertBegining(coef, expo);
          return;
      }
      Node newNode = new Node(coef, expo);
      Node temp = head;
      while(temp.next != null){
          temp = temp.next;
      }
      temp.next = newNode;
  }

  void display(){
      System.out.println();
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.coef+"x"+temp.expo+"+ ");
          temp = temp.next;
      }
  }

}
public class PolyAdd {

  static LinkedList p;

  static void addPoly(Node p1,Node p2){
      p = new LinkedList();
      while(p1 != null & p2 != null){
          if(p1.expo == p2.expo){
              p.insertLast(p1.coef+p2.coef, p1.expo);
              p1 = p1.next;
              p2 = p2.next;
          }
          else if(p1.expo > p2.expo){
              p.insertLast(p1.coef, p1.expo);
              p1 = p1.next;
          }
          else if(p2.expo > p1.expo){
              p.insertLast(p2.coef, p2.expo);
              p2 = p2.next;
          }
      }
      while(p1 != null){
          p.insertLast(p1.coef, p1.expo);
          p1 = p1.next;
      }
      while(p2 != null){
          p.insertLast(p2.coef, p2.expo);
          p2 = p2.next;
      }
  }

  public static void main(String[] args) {
      
      LinkedList p1 = new LinkedList();
      p1.insertLast(3,2); // 3x2 + 4x + 1
      p1.insertLast(4,1);
      p1.insertLast(1,0);

      LinkedList p2 = new LinkedList();
      p2.insertLast(4,2); // 4x2 + 2
      p2.insertLast(2,0);

      p1.display();
      p2.display();

      addPoly(p1.head,p2.head);
      p.display();

  }
}