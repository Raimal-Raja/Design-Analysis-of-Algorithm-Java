public class BinarySearchNextGreaterLetter {
    public static void main(String[]args){
        char[] letters  = {'a','b','c','d','f'};
        char target = 'a';

        char result = binarySearch(letters, target);
        System.out.println(result);
    }

    private static char binarySearch(char [] letters, char target){
        int left = 0;
        int right = letters.length-1;

        while (left<=right) {

            int mid = left + (right-left)/2;
            if (target<letters[mid]) {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if (target == letters.length) {
            return letters[0];
        }
        else{
            return letters[left];
        }

    }
}
