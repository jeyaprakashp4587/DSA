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
    // System.out.println("data"+data);
    newNode.next = head;
    // System.out.println("next"+newNode.data);
    head = newNode;
    // System.out.println("newNode"+newNode.next);
  }
  // display
  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data+"->");
      current = current.next;
    }
  }
}

public class Main {
    public static void main(String[] args) {
      
        LinkedList list = new LinkedList();
       
         list.addBegin(5);
          list.addBegin(2);
           list.addBegin(9);
            list.addBegin(6);
        list.display();
    }
}
