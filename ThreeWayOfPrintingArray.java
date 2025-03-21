import java.util.Arrays;
public class ThreeWayOfPrintingArray{
    public static void main(String[]arg){
        int arr[] = {1,2,3,4,5,5};

        //Method 1
        System.out.println("Printing Method -1");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //Method 2
        System.out.println("Printing Method -2");
        for(int i:arr){
            System.out.println(i);
        }

        //Method 3
        System.out.println("Printing Method -3");
        System.out.println(Arrays.toString(arr));
        System.err.println();
    }
}