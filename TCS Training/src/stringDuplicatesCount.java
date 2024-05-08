import java.util.HashMap;
import java.util.Map;

public class stringDuplicatesCount {

    public static void duplicateCount(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            sb.append(entry.getKey());
            if(entry.getValue() > 1){
                sb.append(entry.getValue());
            }
        }
        System.out.print(sb);

    }
    public static void main(String[] args) {
        String s = "abbccccc";
        duplicateCount(s);
    }
}
