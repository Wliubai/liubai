import java.util.Arrays;

/**
 * @program: 20220115
 * @description
 * @author: WJJ
 * @create: 2022-01-19 15:05
 **/
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity=10;

    public MyArrayList(){
        this.elem=new int[intCapacity];
        this.usedSize=0;
    }
    private boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }
    public void add(int pos,int data){
        //扩容
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //挪数据
        if(pos<0 || pos>this.usedSize){
            return;
        }
        for(int i=usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    public void display(){
        for(int i = 0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
    }
    public boolean contain(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有要删除的数字");
        }
        for(int i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }




}
