/**
 * @program: 20220121
 * @description
 * @author: WJJ
 * @create: 2022-01-21 14:15
 **/
public class TestDemo {
        public static void main(String[] args) {
            MyLinkedList myLinkedList=new MyLinkedList();
            myLinkedList.addFirst(23);
            myLinkedList.addFirst(13);
            myLinkedList.addFirst(15);
            myLinkedList.addFirst(18);
            myLinkedList.addLast(32);
            myLinkedList.addLast(31);
            myLinkedList.addLast(29);
            myLinkedList.addLast(27);
            boolean flg=myLinkedList.contains(78);
            System.out.println(flg);
            System.out.println(myLinkedList.size());
            myLinkedList.display();
            myLinkedList.addIndex(0,2);
            myLinkedList.display();
            myLinkedList.remove(29);
            myLinkedList.display();
            myLinkedList.removeAllKey(23);
            myLinkedList.display();

        }

}
