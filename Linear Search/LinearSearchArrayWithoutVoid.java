public class LinearSearchArrayWithoutVoid {
    public static void main(String[]args){
        int [] arr = {1,2,3,4,5,6,7};
        int target = 3;
        find(arr,target);

    }
    private static void find(int[]arr, int target){
        boolean b = false;
        for(int i = 0; i<arr.length -1;i++){
            if(arr[i] ==target){
                b = true;
                break;
            }
        }
        if(b)
            System.out.println("Found");
        else
            System.out.println("Not Found");
        System.out.println(b? "Found":"Not Found");
    }
}
