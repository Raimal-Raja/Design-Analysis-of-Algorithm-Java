public class BinarySearch_Floor {
    public static void main(String[]args){
        int arr[] = {-12,-7,-3, 0, 4, 7,9,10,16,33,67,87,98,102,204,406};
        System.out.println(binarySearch(arr, 90));
    }
    private static int binarySearch(int []arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left<=right) {

            int mid  = left+(right-left)/2;
            if(target<arr[mid]){
                right = mid-1;
            }
            else{
                if (target>arr[mid]) {
                    left = mid+1;
                }
                else{
                    return mid;
                }
            }
           
        }
         return right; // for index
            // return arr[right] // for value
    }
}
