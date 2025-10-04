class SinglyNode {
    int data;
    SinglyNode next;
    SinglyNode(int data) { this.data = data; this.next = null; }
}

class SinglyLinkedList {
    private SinglyNode head;
    public void insert(int data) {
        SinglyNode newNode = new SinglyNode(data);
        if (head == null) { head = newNode; return; }
        SinglyNode current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }
    public void display() {
        SinglyNode current = head;
        System.out.print("Singly Linked List: ");
        while (current != null) { System.out.print(current.data + " -> "); current = current.next; }
        System.out.println("null");
    }
    public boolean search(int data) {
        SinglyNode current = head;
        while (current != null) { if (current.data == data) return true; current = current.next; }
        return false;
    }
    public boolean delete(int data) {
        if (head == null) return false;
        if (head.data == data) { head = head.next; return true; }
        SinglyNode current = head;
        while (current.next != null && current.next.data != data) current = current.next;
        if (current.next == null) return false;
        current.next = current.next.next;
        return true;
    }
}

class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;
    DoublyNode(int data) { this.data = data; this.next = null; this.prev = null; }
}

class DoublyLinkedList {
    private DoublyNode head;
    public void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) { head = newNode; return; }
        DoublyNode current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
        newNode.prev = current;
    }
    public void display() {
        DoublyNode current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) { System.out.print(current.data + " <-> "); current = current.next; }
        System.out.println("null");
    }
    public boolean search(int data) {
        DoublyNode current = head;
        while (current != null) { if (current.data == data) return true; current = current.next; }
        return false;
    }
    public boolean delete(int data) {
        if (head == null) return false;
        if (head.data == data) { head = head.next; if (head != null) head.prev = null; return true; }
        DoublyNode current = head;
        while (current != null && current.data != data) current = current.next;
        if (current == null) return false;
        if (current.next != null) current.next.prev = current.prev;
        if (current.prev != null) current.prev.next = current.next;
        return true;
    }
}