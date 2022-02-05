/**
 * @program: 2022-2-5
 * @description
 * @author: WJJ
 * @create: 2022-02-05 11:58
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
    public Node head;
    public boolean hasCycle(){
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       if(slow==fast){
           return true;
       }
     return false;
    }
    public Node detectCycle(){
        Node fast=this.head;
        Node slow=this.head;

        while(fast!=null && slow!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
      return slow;
    }
}
