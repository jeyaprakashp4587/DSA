#include <iostream>
using namespace std;
// struct Node {
//     int data;
//     Node* next;
    
//     Node(int val) : data(val), next(nullptr) {}
// };
// class LinkedList {
// private:
//     Node* head;

// public:
//     LinkedList() : head(nullptr) {}

//     void append(int value) {
//         Node* newNode = new Node(value);
//         if (head == nullptr) {
//             head = newNode;
//             return;
//         }
//         Node* temp = head;
//         while (temp->next != nullptr) {
//             temp = temp->next;
//         }
//         temp->next = newNode;
//     }

//     void display() {
//         Node* temp = head;
//         while (temp != nullptr) {
//             std::cout << temp->data << " ";
//             temp = temp->next;
//         }
//         std::cout << std::endl;
//     }

//     void sort() {
//         if (head == nullptr || head->next == nullptr) {
//             return;
//         }
//         Node* i = head;
//         while (i != nullptr) {
//             Node* j = i->next;
//             while (j != nullptr) {
//                 if (i->data > j->data) {
//                     std::swap(i->data, j->data);
//                 }
//                 j = j->next;
//             }
//             i = i->next;
//         }
//     }
// };
// int main() {
//     LinkedList list;
//     list.append(4);
//     list.append(2);
//     list.append(3);
//     list.append(1);
    
//     std::cout << "Original List: ";
//     list.display();

//     list.sort();

//     std::cout << "Sorted List: ";
//     list.display();

//     return 0;
// }
struct Node
    {
       int data;
       Node* next;
       Node(int val) : data(val) ,next(nullptr){};
    };
    void Insert(Node* &head,int val){
        Node* newNode = new Node(val);
        if(head == nullptr)
        {
            head = newNode;
        }
        Node* temp = head;
        while (temp->next)
        {
            temp = temp->next;
        }
        temp->next = newNode;
        cout<<temp->data;
    }
int main() {
    Node* head = nullptr;
    Insert(head,10);
    Node* rt = head;
    // while (rt !=nullptr)
    // {
    //     cout<<rt->data;
    //     rt=rt->next;
    // }
    return 0;
}
