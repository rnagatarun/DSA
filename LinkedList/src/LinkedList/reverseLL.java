package LinkedList;

public class reverseLL {
    public static class Node{
        Node next;
        int data;

        public Node(int data,Node next){
            this.next = next;
            this.data = data;
        }
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node reverse(Node head){
        Node prev = null;
        Node next;
        Node current = head;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    return head;
    }
    public static void printReverse(Node head){
        while(head!=null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("END");
    }



    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node temp = reverse(head);
        printReverse(temp);




    }
}
