import javax.print.DocFlavor;
import java.util.Locale;

public class stringPalindrome {

    public static String isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }


        int left = 0;
        int right = sb.length() - 1;
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                return "NO";
            }
            left++;
            right--;

        }
        return "YES";
    }

    public static void main(String[] args) {
        String s1 = "I am :IronnorI Ma, i";
        String s2 = "Ab?11Ba";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}
