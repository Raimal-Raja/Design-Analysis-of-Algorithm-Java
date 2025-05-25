public class BinarySearchNextGreater2 {
    public static void main(String[] args){
        char[] letters = {'a','b','c','d','f'};
        char target = 'c';

        char result = binarySearch(letters, target);
        System.out.println(result);
    }

    private static char binarySearch(char [] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<letters[mid]) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        
        return letters[start%letters.length];
    }
}
