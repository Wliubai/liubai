/**
 * @program: 20220121
 * @description
 * @author: WJJ
 * @create: 2022-01-21 14:13
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
    public Node head;//保存单链表的头节点的引用  null
    //头插法
    /*public void addFirst(int data) {
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }*/
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
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
       Node cur=this.head;
       while(cur!=null){
           if(cur.data==key){
               return true;
           }
           cur=cur.next;
       }
        return false;
    }
    //得到单链表的长度
    public int size(){
        int count=0;
        Node cur=this.head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index==this.size()){
            addLast(data);
            return;
        }
        Node node=new Node(data);
        //先找到index位置的前一个节点位置
        Node cur=searchIndex(index);
        //进行插入
        node.next=cur.next;
        cur.next=node;
    }
    private Node searchIndex(int index){
        //1、对index进行合法性检查
        if(index<0||index>this.size()){
            throw new RuntimeException("index位置不合法！");
        }
        Node cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    private Node searchPrev(int key){
        Node prev=this.head;
        while(prev.next != null){
            if(prev.next.data==key){
                return prev;
            }else{
                prev=prev.next;
            }
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){
            return;
        }
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
        Node prev=searchPrev(key);

            if(prev==null){
                System.out.println("根本没有这个节点");
                return;
            }
            Node del = prev.next;
            prev.next=del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null){
            if(cur.data==key){
                prev.next=cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        this.head=null;
    }
}

