public class PalindromString {
    public static void main(String[]raja){

        String a = "madam";
        boolean b = palindrom(a);
        System.err.println(b);
    }

    private static boolean palindrom(String str){
        boolean b = true;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                b = false;
                break;
            }
            
        }
        return b;
    }
    }
