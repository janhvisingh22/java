class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Delete_DLL {
    private Node head;

    // Method to delete an element from the doubly linked list using recursion
    void deleteElement(int data) {
        head = deleteElementRecursive(head, data);
    }

    Node deleteElementRecursive(Node current, int data) {
        if (current == null) {
            return current;
        }

        // If the current node contains the data to be deleted
        if (current.data == data) {
            // Update the next node's prev reference
            if (current.next != null) {
                current.next.prev = current.prev;
            }

            // Update the previous node's next reference
            if (current.prev != null) {
                current.prev.next = current.next;
            }

            return current.next; // Return the next node as the new head
        }

        // Continue the recursion
        current.next = deleteElementRecursive(current.next, data);
        return current;
    }

    void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Delete_DLL doublyLinkedList = new Delete_DLL();

        doublyLinkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        doublyLinkedList.head.next = second;
        second.prev = doublyLinkedList.head;
        second.next = third;
        third.prev = second;

        System.out.print("Doubly Linked List: ");
        doublyLinkedList.displayList();

        doublyLinkedList.deleteElement(2);

        System.out.print("Updated Doubly Linked List: ");
        doublyLinkedList.displayList();
    }
}