import java.util.HashMap;
import java.util.Scanner;
public class AnagramPalindrome {

    public static boolean AnagramPalindrom(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int oddCount =0;
        for(int count:map.values()){
            if(count%2 != 0){
                oddCount++;
            }
        }
        return oddCount<=1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // s = carerace -> racecar
        System.out.println(AnagramPalindrom(s));
    }
}
