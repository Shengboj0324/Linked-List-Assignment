# Linked List Assignment

## File Documentation

### Element.java
Core data structure implementation file containing node and list classes.

**Node Classes:**
- `SinglyNode`: Contains integer data field and next pointer for unidirectional traversal
- `DoublyNode`: Contains integer data field, next pointer, and previous pointer for bidirectional traversal

**List Classes:**
- `SinglyLinkedList`: Manages singly linked nodes with private head reference
- `DoublyLinkedList`: Manages doubly linked nodes with private head reference

**Methods:**
- `insert(int data)`: Traverses to end of list and appends new node with proper linking
- `display()`: Iterates through list and prints all elements with directional arrows
- `search(int data)`: Traverses list to locate element, returns boolean result
- `delete(int data)`: Removes specified element while maintaining pointer integrity, returns boolean success status

**Correlations:**
- Both list types share identical method signatures for consistent interface
- Delete method handles edge cases including empty list, head deletion, and missing elements
- All methods utilize traversal patterns with null-checking for safety

### Main.java
Primary execution file demonstrating complete linked list functionality.

**Operations Demonstrated:**
- Insert operations: Adds 5 elements to each list type
- Search operations: Tests both successful and unsuccessful element lookups
- Delete operations: Removes elements and validates proper list restructuring
- Verification operations: Confirms deletions through subsequent searches

**Boolean Usage:**
- `found`: Stores search result for existing element
- `notFound`: Stores search result for non-existent element
- `deleted`: Captures delete operation success status
- `stillExists`: Verifies element removal through search
- `foundDoubly`: Validates doubly linked list search functionality
- `deletedDoubly`: Confirms doubly linked list delete success
- `failedDelete`: Tests delete behavior on missing element

**Correlations:**
- Demonstrates Element.java methods in practical scenarios
- Uses boolean returns for conditional logic and user feedback
- Tests edge cases to validate robust implementation
- Separates singly and doubly linked list operations for clarity

### LinkedList.java
Standalone test case file for validation purposes.

**Test Coverage:**
- Insertion testing: Adds 4 elements to each list type
- Search testing: Verifies element lookup with existing and non-existent values
- Display testing: Confirms proper list visualization

**Correlations:**
- Independent validation separate from Main.java execution
- Uses smaller dataset for focused testing
- Provides alternative test scenarios for Element.java methods
