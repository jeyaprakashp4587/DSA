/**
 * Likedlists
 */
// create linked list
/**
 * Node
 */
class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

/**
* 
*/
class Linked {
  Node head;

  public void addNode(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void displayNodes() {
    Node temp = head;
    if (temp == null) {
      return;
    }
    while (temp != null) {
      System.out.println("data" + temp.data + "->" + "nextNode" + temp.next);
      temp = temp.next;
    }
  }

  public void insertData(int data, int index) {
    // if (index) {
    Node Newnode = new Node(data);
    if (index == 0) {
      Newnode.next = head;
      head = Newnode;
      return;
    }
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }
    // System.out.println("current Node" + current.next);
    Newnode.next = current.next;
    current.next = Newnode;
  }

  // get length
  public int getSize() {
    int count = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      count++;
    }
    // System.out.println("Linked List Size" + count);
    return count;
  }

  //
  public void insertAtLast(int data) {
    Node newNode = new Node(data); // Create a new node

    // If the list is empty, the new node becomes the head
    if (head == null) {
      head = newNode;
      return;
    }

    // Traverse to the last node
    Node current = head;
    while (current.next != null) {
      current = current.next;
      System.out.println("curretn" + current.data);
    }

    // Set the next of the last node to the new node
    current.next = newNode;

  }
}

//
public class Likedlists {
  public static void main(String[] args) {
    Linked link = new Linked();
    link.addNode(5);
    link.addNode(10);
    // link.insertData(2, 2);
    link.insertData(1, 1);
    link.insertData(6, 2);
    link.insertAtLast(4);
    link.displayNodes();
    // link.getSize();
  }
}