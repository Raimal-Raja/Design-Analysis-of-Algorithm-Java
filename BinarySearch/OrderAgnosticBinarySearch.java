public class OrderAgnosticBinarySearch {
    public static void main(String[]args){
        int arr1[] = {-12,-7,-3,0,4,7,9,10,16,33,67,87,89,102,204,406};
        int arr2[] = {406,204,102,98,87,67,33,16,10,9,7,4,0,-3,-7,-12};
        int target = 87;

        System.out.println(orderAgnosticBS(arr1, target)); // Searching in the ascending array
        System.out.println(orderAgnosticBS(arr2, target)); // Searching in the descending array
    }

    private static int orderAgnosticBS(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        boolean isAsc = arr[left] < arr[right];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}