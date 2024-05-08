package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        //Add elements at end
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.append(60);

        //To know how many elements are there in list
        System.out.println(list.size());

        //Add elements at end
        list.add(5);

        //Add at any position
        list.insert(25, 3);

        //Delete First Element
        System.out.println(list.deleteFirst());

        //Delete Last Element
        System.out.println(list.deleteLast());

        //Delete at any position
        System.out.println(list.deleteAtIndex(3));

        list.display();


    }
}
