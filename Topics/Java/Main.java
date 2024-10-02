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
    newNode.next =head;
  }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("d");
    }
}
