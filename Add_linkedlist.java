class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addElement(int data) {
        head = addElementRecursive(head, data);
    }

    Node addElementRecursive(Node current, int data) {
        if (current == null) {
            // If the current node is null, create a new node with the data and return it.
            return new Node(data);
        }

        // Recursively move to the end of the list.
        current.next = addElementRecursive(current.next, data);

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
}

public class Add_linkedlist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);

        System.out.print("Linked List: ");
        linkedList.displayList();

        linkedList.addElement(4);

        System.out.print("Updated Linked List: ");
        linkedList.displayList();
    }
}