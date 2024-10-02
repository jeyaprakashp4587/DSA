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
    Node newNode = new Node(data);

    Node current = head;
    
    for(int i=0;i<index-1;i++){
     current = current.next;
    }
    newNode.next = current;
    current.next = newNode;
  }
}

public class Main {
    public static void main(String[] args) {
      
        LinkedList list = new LinkedList();
         list.addBegin(5);
          list.addBegin(10);
          list.addBegin(1);
          list.display();
          list.addindex(2, 2);
    }
}
