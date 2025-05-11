public class BinarySearch{

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 10, 14, 18, 22, 27, 30};
        int target = 14;

        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target)
                return mid;


            if (arr[mid] < target)
                left = mid + 1;


            else
                right = mid - 1;
        }

   
        return -1;
    }
}
