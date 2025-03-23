public class SearchForString {
    public static void main(String[]raja){
        String str = "Raimal";
        boolean b = find(str,'y');
        System.out.println("Found y "+b);
    }
    private static boolean find(String str, char x){
        if (str.length() ==0){
            return false;
        }
        else{
            for(int i = 0; i<str.length();i++){
                if(str.charAt(i) ==x){
                    return true;
                }
            }
            return false;
        }
    }
}
