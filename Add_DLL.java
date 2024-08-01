class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
        } else {
            Node current = head;
            int currentPosition = 0;

            while (currentPosition < position - 1 && current != null) {
                current = current.next;
                currentPosition++;
            }

            if (currentPosition != position - 1) {
                System.out.println("Position exceeds the length of the list.");
                return;
            }

            newNode.prev = current;
            newNode.next = current.next;

            if (current.next != null) {
                current.next.prev = newNode;
            } else {
                tail = newNode;
            }

            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Add_DLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Initial doubly linked list:");
        list.display();

        list.insertAtBeginning(0);
        System.out.println("Doubly linked list after inserting at the beginning:");
        list.display();

        list.insertAtEnd(4);
        System.out.println("Doubly linked list after inserting at the end:");
        list.display();

        list.insertAtPosition(2, 2);
        System.out.println("Doubly linked list after inserting at position 2:");
        list.display();

        list.insertAtPosition(5, 6); // This will exceed the list length
    }
}
