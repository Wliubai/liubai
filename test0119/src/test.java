import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 20220115
 * @description
 * @author: WJJ
 * @create: 2022-01-19 10:24
 **/
public class test {
    public int[] elem;
    public int usedSize;
    public static final int intCapacity=10;

    public test(){
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
            System.out.println(this.elem[i]+"");
        }
    }
    public static void main(String[] args) {


    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        for(int i =2; i<=100; i++ ){
            for(int j = 2; j<=Math.sqrt(i);j++){
            if(i%j==0&&i!=j){
                break;
            }
            if(i%j!=0) {
                System.out.print(i);
            }
        }
    }
    /*public static void main1(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
        if(n < 18){
           System.out.println("少年");
        }
        else if(n >= 19 && n <28){
            System.out.println("青年");
        }
        else if(n >= 29 && n< 55){
            System.out.println("中年");
        }
        else{
            System.out.println("老年");
        }*/


    }


}
