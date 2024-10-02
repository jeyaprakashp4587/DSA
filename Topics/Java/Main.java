/**
 * InnerLinkedList
 */
 class Node {
  int data;
  Node next;
  Node(int data){
    this.data =data;
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
    System.out.println("data"+data);
    newNode.next = head;
    System.out.println("next"+newNode.data);
    head = newNode;
    System.out.println("newNode"+newNode.next);
  }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("d");
        LinkedList list = new LinkedList();
        list.addBegin(5);
    }
}
