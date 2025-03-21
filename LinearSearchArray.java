import java.util.Arrays;

public class LinearSearchArray {
    public static void main(String[]arg){
        int [] arr = {1,2,3,4,5,6};
        int target = 5;
        System.out.println(Arrays.toString(arr));
        int x = find(arr, target);
        System.out.println("Found at index: "+ x);
    }

    private static int find(int[]arr, int target){
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
