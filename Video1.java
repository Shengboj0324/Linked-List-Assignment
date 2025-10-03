// Singly Linked List Implementation
class SinglyNode {
    int data;
    SinglyNode next;

    // Constructor to initialize node with data
    SinglyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    SinglyNode head;

    // Constructor to initialize empty list
    SinglyLinkedList() {
        this.head = null;
    }

    // Insert element at the end of the list
    void insert(int data) {
        SinglyNode newNode = new SinglyNode(data);

        // If list is empty, make new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        SinglyNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the last node to new node
        current.next = newNode;
    }

    // Display all elements in the list
    void display() {
        SinglyNode current = head;
        System.out.print("Singly Linked List: ");

        // Traverse and print each node's data
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Doubly Linked List Implementation
class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    // Constructor to initialize node with data
    DoublyNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;

    // Constructor to initialize empty list
    DoublyLinkedList() {
        this.head = null;
    }

    // Insert element at the end of the list
    void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);

        // If list is empty, make new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the last node to new node and vice versa
        current.next = newNode;
        newNode.prev = current;
    }

    // Display all elements in forward direction
    void display() {
        DoublyNode current = head;
        System.out.print("Doubly Linked List: ");

        // Traverse and print each node's data
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Video1 {
    public static void main(String[] args) {
        // Create and populate singly linked list
        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.insert(10);
        singlyList.insert(20);
        singlyList.insert(30);
        singlyList.insert(40);
        singlyList.insert(50);

        // Display singly linked list
        singlyList.display();

        System.out.println();

        // Create and populate doubly linked list
        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.insert(100);
        doublyList.insert(200);
        doublyList.insert(300);
        doublyList.insert(400);
        doublyList.insert(500);

        // Display doubly linked list
        doublyList.display();
    }
}

