import java.util.*;
public class AddArrayUsingMethod{
    public static void main(String[]args){

        int[]arr = {2,3,4,5,4,7};
        System.out.println(Arrays.toString(arr));

        int sum = add(arr);
        System.out.println("the sum of array is: " +sum);
        System.out.println(mostFreq(arr));
    }

    public static int mostFreq(int arr[]){
        Map <Integer,Integer> freqMap=new HashMap();
        int mostFreqEle=0;
        int maxFreq=0;
        for(int i=0;i<arr.length;i++){
            freqMap.put(arr[i],freqMap.getOrDefault(arr[i], 0)+1);
            if(freqMap.get(arr[i])>maxFreq){
                mostFreqEle=arr[i];
                maxFreq=freqMap.get(arr[i]);
            }

        }
        
            
        
        return mostFreqEle;
    }

private static int add(int[] arr2){
    int x = 0;
    for(int i = 0; i<arr2.length; i++){
        x += arr2[i];
    }
    return x;
}
}