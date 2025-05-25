public class BinarySearchInfiniteArray {
    public static void main(String[] args){
        int arr[] =  {-12,-7,-3, 0, 2,4, 7,9,10,16,33,67,87,98,102,204,406};
        int target = 4;

        int result = find(arr, target);
        System.out.println(result);

    }

    private static int find(int [] arr, int target){
        int left = 0;
        int right = 1;


        while (target>right) {
            int newStart = right+1;
            right = right+(left-right)*2;
            left = newStart;
        }
        return binarySearch(arr, target, left, right);
    }

    private static int binarySearch(int arr[], int target, int left, int right){

        while (left <= right) {
            int mid = left+(right-left)/2;
            if (target > arr[mid]) {
                left = mid+1;
            }
            else{
                if (target < arr[mid]) {
                    right = mid-1;
                }
                else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
