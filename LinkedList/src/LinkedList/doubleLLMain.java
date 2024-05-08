package LinkedList;

public class doubleLLMain {
    public static void main(String[] args) {
        doubleLL list = new doubleLL();
        list.insertFirst(60);
        list.insertFirst(50);
        list.insertFirst(40);
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        list.insertLast(10);
        list.insertAtIndex(25,3);

        list.display();

    }

}
