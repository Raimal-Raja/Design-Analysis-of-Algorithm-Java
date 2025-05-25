import java.util.Arrays;

public class BinarySearchLastFirstOccurance {
    public static void main(String [] args){
        int [] arr =  {1,2,2,3,3,45,5};
        int target = 3;

        int result [] = searchRange(arr, target);

        System.out.println(Arrays.toString(result));
    }

    private static int[]  searchRange(int arr[], int target){
        int ans[] = {-1,-1};
        ans[0] = binarySearch(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }

    private static int binarySearch(int arr[], int target, boolean b){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;

            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            }
            else{
                ans = mid;
                if (b) {
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    
}
