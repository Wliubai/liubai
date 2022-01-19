/**
 * @program: 20220115
 * @description
 * @author: WJJ
 * @create: 2022-01-19 15:13
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        MyArrayList myArrayList1=new MyArrayList();
        for(int i=0;i<10;i++){
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,110);
        myArrayList1.display();
        myArrayList1.remove(0);
        myArrayList1.display();
        myArrayList1.remove(110);
        myArrayList1.display();
    }
}
