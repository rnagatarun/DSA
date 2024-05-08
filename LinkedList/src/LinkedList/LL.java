package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private Node current;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;

    }

    public void append(int val){
        Node node = new Node(val);
        size+=1;
        if(head == null){
            head = node;
            current = head;
        }
        current.next = node;
        current = node;
    }

    public int size(){
        return size;
    }

    public void add(int val){
        size+=1;
        Node node = new Node(val);
        if(head == null){
            head = node;
            current = head;
        }
        current = node;
        current.next = head;
        head = current;
    }


    public void insert(int val,int index){
        if(index==0){
            add(val);
        }
        if(index == size ){
            append(val);
        }
        Node current = head;
        for(int i=1;i<index;i++){
            current = current.next;
            break;
        }

        Node node = new Node(val);
        node.next = current.next;
        current.next = node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node current = head;
        for(int i=2;i<size;i++){
            current = current.next;
        }
        Node tail = current.next;
        int val = tail.value;
        tail = current;
        tail.next = null;
        size--;

        return val;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node current = head;
        for(int i=2;i<index;i++){
            current = current.next;
            break;
        }
        int val = current.next.value;
        current.next = current.next.next;

        return val;

    }


    public void display(){
        Node current = head;

        while(current!= null){
            System.out.print(current.value + "-->");
            current = current.next;

        }
        System.out.println("END");

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }


}
