class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Delete_linkedlist {
    Node head;

    // Function to delete a node with a given key
    void deleteNode(int key) {
        Node current = head;
        Node prev = null;

        // If the head node itself holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Change the head
            return;
        }

        // Search for the key to be deleted while keeping track of the previous node
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is not present in the list
        if (current == null)
            return;

        // Unlink the node from the linked list
        prev.next = current.next;
    }

    // Function to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Delete_linkedlist list = new Delete_linkedlist();

        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        list.head.next = second;
        second.next = third;

        System.out.println("Original Linked List:");
        list.printList();

        int key = 2;
        list.deleteNode(key);

        System.out.println("\nLinked List after deleting node with key " + key + ":");
        list.printList();
    }
}