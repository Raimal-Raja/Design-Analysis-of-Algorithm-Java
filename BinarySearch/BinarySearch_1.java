public class BinarySearch_1{
    public static void main(String[]args){
        int arr[] = {-12,-7,-3, 0, 4, 7,9,10,16,33,67,87,98,102,204,406};
        System.out.println(binarySearch(arr,103));
    }

    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end =  arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else{
                if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return - 1;
    }
}
