public class LLReverse_K_Elements {

    Node head;
    Node current;

    Node kth;
    Node next;

    class Node{
        Node next;
        int data;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void push(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            current = head;
        }
        current = node;
        current = current.next;
    }

    public void display(Node head){
        current = head;
        while(current!=null){
            System.out.print(head.data + "->");
            current = current.next;
        }
    }

    public void kthElement(int k,Node current) {
        while (k != 1) {
            kth = current.next;
            k--;
        }
        next = kth.next;
    }




    public Node reverseKElements(int k, Node head){
            list.kthElement(k,head);




        }





    }



    public static void main(String[] args) {
        LLReverse_K_Elements list = new LLReverse_K_Elements();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60);
        list.reverseKElements(2, list.head);


    }
}
