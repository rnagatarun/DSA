// GOOD string if 3 vowels or 5 consonants should not come together
//string has symbol(?) needs to be replaced by any character

public class stringManipulation {
    public static boolean manipulate(String s){
        int vcount = 0;
        int ccount = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vcount++;
                ccount = 0;
            }
            else if(ch == '?'){
                vcount++;
                ccount++;
            }
            else{
                ccount++;
                vcount = 0;
            }
        }
        System.out.println(ccount);
        if(vcount > 5 || ccount > 3){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aeiooiup??";
        System.out.println(manipulate(s));
    }

}
