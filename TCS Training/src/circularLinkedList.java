import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circularLinkedList {
    private Node head;

    public circularLinkedList() {
        this.head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Circular link for single node
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    public void insertBeforeKey(int key, int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        Node prev = null;

        do {
            if (current.data == key) {
                if (prev == null) { // Insertion before the head
                    insertAtBeginning(data);
                    return;
                } else {
                    prev.next = newNode;
                    newNode.next = current;
                    return;
                }
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Key not found");
    }

    public void insertAfterKey(int key, int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        do {
            if (current.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Key not found");
    }

    public void deleteKey(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = null;

        do {
            if (current.data == key) {
                if (prev == null) { // If key is at head
                    Node temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    temp.next = head.next;
                    head = head.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Key not found");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        circularLinkedList list = new circularLinkedList();

        while (true) {
            System.out.println("\nCircular Linked List Operations:");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert Before Key");
            System.out.println("3. Insert After Key");
            System.out.println("4. Delete Key");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert at the beginning: ");
                    int data1 = scanner.nextInt();
                    list.insertAtBeginning(data1);
                    break;
                case 2:
                    System.out.print("Enter the key before which you want to insert: ");
                    int key1 = scanner.nextInt();
                    System.out.print("Enter the data to insert: ");
                    int data2 = scanner.nextInt();
                    list.insertBeforeKey(key1, data2);
                    break;
                case 3:
                    System.out.print("Enter the key after which you want to insert: ");
                    int key2 = scanner.nextInt();
                    System.out.print("Enter the data to insert: ");
                    int data3 = scanner.nextInt();
                    list.insertAfterKey(key2, data3);
                    break;
                case 4:
                    System.out.print("Enter the key to delete: ");
                    int key3 = scanner.nextInt();
                    list.deleteKey(key3);
                    break;
                case 5:
                    System.out.print("Circular Linked List: ");
                    list.display();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
