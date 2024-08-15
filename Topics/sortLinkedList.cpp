#include <iostream>
#include <vector>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int val) : data(val), next(nullptr) {}
};


Node* createLinkedList(vector<int> vals) {
    Node* head = nullptr;
    Node* tail = nullptr;
    for (int val : vals) {
        Node* newNode = new Node(val);
        if (head == nullptr) {
            head = newNode;
            tail = newNode;
        } else {
            tail->next = newNode;
            tail = tail->next;
        }
    }
    return head;
}

int main() {
    // Create two sorted linked lists
    Node* l1 = createLinkedList({1, 3, 5, 7});
    cout<< l1->data;
    // Node* l2 = createLinkedList({2, 4, 6, 8});
    // Print the merged list

    return 0;
}
