/**
 * @program: 20220122
 * @description
 * @author: WJJ
 * @create: 2022-01-22 14:29
 **/

class Node {
    public int data;//0
    public Node next;//null
    public Node(int date){
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    //反转一个单链表
    public Node head;
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            //第一次插入节点
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    public Node reverseList(){
       Node cur=this.head;
       Node prev =null;
       Node newHead=null;
        while(cur != null){
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
    public void display(Node head){
        Node cur = this.head;
        while(cur != null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public Node middleNode(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
