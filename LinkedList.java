// Test case for linked list implementations
public class LinkedList {
    public static void main(String[] args) {
        System.out.println("=== Linked List Test Case ===\n");

        // Test singly linked list
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.insert(5);
        singly.insert(15);
        singly.insert(25);
        singly.insert(35);
        singly.display();

        // Search test for singly linked list
        System.out.println("Search 15: " + singly.search(15));
        System.out.println("Search 100: " + singly.search(100));

        System.out.println();

        // Test doubly linked list
        DoublyLinkedList doubly = new DoublyLinkedList();
        doubly.insert(50);
        doubly.insert(150);
        doubly.insert(250);
        doubly.insert(350);
        doubly.display();

        // Search test for doubly linked list
        System.out.println("Search 250: " + doubly.search(250));
        System.out.println("Search 500: " + doubly.search(500));

        System.out.println("\n=== Test Completed Successfully ===");
    }
}

