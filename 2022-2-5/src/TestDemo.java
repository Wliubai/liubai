/**
 * @program: 2022-2-5
 * @description
 * @author: WJJ
 * @create: 2022-02-05 11:57
 **/
public class TestDemo {
    public Node getIntersectionNod(Node headA,Node headB){
       int lenA=0;
       int lenB=0;
       Node pl=headA;
       Node ps=headB;
       while(pl != null){
           lenA++;
           pl=pl.next;
       }
       while(ps!=null){
           lenB++;
           ps=ps.next;
       }
       pl=headA;
       ps=headB;
       int len=lenA-lenB;
       if(len<0){
          pl=headB;
          ps=headA;
          len=lenB-lenA;

       }
       //pl一定指向的是最长的单链表
       for(int i=0;i<len;i++){
           pl=pl.next;
       }
       //pl和ps一定是在同一个起跑线上
       while(ps!=pl && ps!=null && ps!=null){
           ps=ps.next;
           pl=pl.next;
       }
       if(pl==ps && pl!=null){
           return pl;
       }
       return null;
    }
    public Node mergeTwoLists(Node headA,Node headB){
        Node newHead=new Node(-1);
        Node tmp=newHead;
        while(headA!=null && headB!=null){
            if(headA.data<headB.data){
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }
}
