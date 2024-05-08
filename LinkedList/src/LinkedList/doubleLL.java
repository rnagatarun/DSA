package LinkedList;

public class doubleLL {
    Node head;

    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
         public Node(int val,Node next,Node prev){
             this.val = val;
             this.next = next;
             this.prev = prev;
         }

        public Node(int val) {
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node current =head;
        while(current.next!=null){
            current = current.next;
        }
        Node node = new Node(val);
        node.prev =current;
        current.next = node;
        node.next = null;
    }

    public void insertAtIndex(int val,int index){
        Node node = new Node(val);
        Node current = head;
        if(index == 1){insertFirst(val);}
        for(int i=2;i<index;i++){
            current = current.next;
        }
        node.prev = current;
        node.next = current.next;
        current.next = node;
        current.next.next.prev = node;

    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val + "<-->");
            node = node.next;
        }
        System.out.print("END");

    }



}
