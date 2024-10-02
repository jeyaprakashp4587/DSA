/**
 * InnerLinkedList
 */
 class Node {
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}

/**
 * InnerMain
 */
 class LinkedList {
  Node head;
  // Node newNode
  public void addBegin(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    // System.out.println("head"+head);
    //  System.out.println("data"+newNode.data);
    //   System.out.println("next"+newNode.next);
    //   System.out.println("==========");
  }
  // display
  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(" "+current.data+"->"+current.next);
      current = current.next;
    }
  }
  // insert position
  public void addindex (int index,int data) {

        if (index < 0) {
            System.out.println("Index cannot be negative.");
            return;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
int cnt=0;
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
            cnt++;
        }
System.out.println(cnt);
        newNode.next = current.next;
        current.next = newNode;
}
 }

public class Likedlists {
    public static void main(String[] args) {
      
        LinkedList list = new LinkedList();
         list.addBegin(5);
          list.addBegin(10);
          list.addBegin(1);
            list.addindex(2,2);
            list.addindex(3,19);
          list.display();
        
    }
}
