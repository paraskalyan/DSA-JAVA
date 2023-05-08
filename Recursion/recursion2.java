package Recursion;
public class recursion2 {
    public static void main(String[] args) {
        String str = "PIP";
        int s = str.length();
        boolean pal = palindrome(str, s-1, 0);
        if(pal) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
    public static boolean palindrome(String str, int s, int l){
        if(str.charAt(l) != str.charAt(s)){
            return false;
        }
        if(l>=s){
            return true;
        }

        return palindrome(str, s-1, l+1);

    }
}
