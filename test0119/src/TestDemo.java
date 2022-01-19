import java.util.Arrays;

/**
 * @program: 20220115
 * @description
 * @author: WJJ
 * @create: 2022-01-15 14:44
 **/
public class TestDemo {
    public static void swap(int[] array){
        int left=0;
        int right=array.length-1;
        while(left<right ){
            while(left<right && array[left]%2==0){
                left++;
            }
            while(left<right && array[right]%2!=0){
                right--;
            }
           if(left<right){
                int temp=array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={2,5,6,9,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static boolean isUp(int[] array){
        for(int i = 0;i< array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main5(String[] args) {
        int[] array={1,2,8,7,9};
        System.out.println( isUp(array));
    }
    public static int binarySearch(int[] array,int key){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]<key){
                left=mid+1;
            }else if(array[mid]>key){
                right=mid-1;
            }else{
               return mid;
            }
        }
        return -1;
    }
    public static void main4(String[] args) {
        int[] array = {2,5,8,9,13};
       /* System.out.println(binarySearch(array,13));*/
        int ret=binarySearch(array,6);
        System.out.println("下标是："+ret);
    }
    public static int[] copyArray(int[] array){
        int[] ret = new int[array.length];
        for(int i=0;i<array.length;i++){
            ret[i]=array[i];

        }
        return ret;

    }

    public static void main2(String[] args) {
        int[] array={12,4,67,23,9};
        System.out.println(maxNum(array));
    }
    public static int maxNum(int[] array){
        int maxNum= array [0];
        for(int i = 0;i<array.length;i++){
            if(array[i]>maxNum){
                maxNum=array[i];
            }
        }
        return maxNum;
    }
    
}
