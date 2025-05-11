import java.util.Arrays;

public class LinearSearchMinValues {
    public static void main(String[]raimal){
        int[] arr = {10,34,4545,53,33,44};
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println(min);
    }

    private static int findMin(int[]arr){

        int min = arr[0];
        for(int i =1; i< arr.length; i++){
            if(arr[i]<min)
                min = arr[i];
        }
        return min;
    }
}
