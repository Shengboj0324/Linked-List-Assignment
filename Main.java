// Main execution class for linked list demonstrations
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Singly Linked List Operations ===");

        // Create and populate singly linked list
        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.insert(10);
        singlyList.insert(20);
        singlyList.insert(30);
        singlyList.insert(40);
        singlyList.insert(50);
        System.out.print("After insertions: ");
        singlyList.display();

        // Search operations with boolean results
        boolean found = singlyList.search(30);
        System.out.println("Search for 30: " + (found ? "Found" : "Not Found"));
        boolean notFound = singlyList.search(100);
        System.out.println("Search for 100: " + (notFound ? "Found" : "Not Found"));

        // Delete operation with boolean validation
        boolean deleted = singlyList.delete(30);
        if (deleted) {
            System.out.print("After deleting 30: ");
            singlyList.display();
        }

        // Verify deletion with search
        boolean stillExists = singlyList.search(30);
        System.out.println("Verify 30 deleted: " + (!stillExists ? "Success" : "Failed"));

        System.out.println("\n=== Doubly Linked List Operations ===");

        // Create and populate doubly linked list
        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.insert(100);
        doublyList.insert(200);
        doublyList.insert(300);
        doublyList.insert(400);
        doublyList.insert(500);
        System.out.print("After insertions: ");
        doublyList.display();

        // Search operations with boolean results
        boolean foundDoubly = doublyList.search(400);
        System.out.println("Search for 400: " + (foundDoubly ? "Found" : "Not Found"));

        // Delete operation with boolean validation
        boolean deletedDoubly = doublyList.delete(300);
        if (deletedDoubly) {
            System.out.print("After deleting 300: ");
            doublyList.display();
        }

        // Attempt to delete non-existent element
        boolean failedDelete = doublyList.delete(999);
        System.out.println("Delete 999: " + (failedDelete ? "Success" : "Failed - Not Found"));

        System.out.println("\n=== All Operations Completed ===");
    }
}

