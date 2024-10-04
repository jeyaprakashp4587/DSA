/**
 * InnerAddTwoSum
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkList {
    Node head;

    public void addList(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
}

class addSums {
    public static int addSum(Node li) {
        int sum = 0;
        while (li != null) {
            sum += li.data;
            li = li.next;
        }
        return sum;
    }

}

public class AddTwoSum {
    public static void main(String[] args) {
        LinkList list1 = new LinkList();

        // Sum sum = new
        list1.addList(3);
        list1.addList(1);
        list1.addList(5);
        LinkList list2 = new LinkList();
        list2.addList(3);
        list2.addList(1);
        list2.addList(5);
        int sum = addSums.addSum(list1.head);
    }

}
