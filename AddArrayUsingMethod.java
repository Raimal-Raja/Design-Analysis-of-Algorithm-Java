import java.util.Arrays;
public class AddArrayUsingMethod{
    public static void main(String[]args){

        int[]arr = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr));

        int sum = add(arr);
        System.out.println("the sum of array is: " +sum);
    }

private static int add(int[] arr2){
    int x = 0;
    for(int i = 0; i<arr2.length; i++){
        x += arr2[i];
    }
    return x;
}
}