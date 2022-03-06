/**
 * @program: 2022-3-6
 * @description
 * @author: WJJ
 * @create: 2022-03-06 10:23
 **/

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(3);
        myLinkedList.addLast(9);
        myLinkedList.display();
        myLinkedList.clear();
        System.out.println(" ");
       /* myLinkedList.addIndex(0,99);
        myLinkedList.display();
        myLinkedList.addIndex(3,134);
        myLinkedList.display();
        myLinkedList.remove(99);
        myLinkedList.display();*/

        /*System.out.println(myLinkedList.contains(5));
        System.out.println(myLinkedList.size());*/

    }
}
