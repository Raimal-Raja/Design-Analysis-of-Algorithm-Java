import java.util.Arrays;
public class ReverseArrayCreateTwoMethods {
    public static void  main(String[]args){
        int array[] = {2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));

    }
    private static void reverse(int[]arr){
        int  start = 0;
        int end =  arr.length -1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private static void swap (int []arr, int start, int end){
        int temp = 0;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;

    }
}
