import java.util.Stack;

public class balancedStringExpression {

    public static boolean balancedBrackets(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.size() == 0 || st.peek()!='('){return false;}
                else{st.pop();}
            }

            else if(ch == '}'){
                if(st.size() == 0 || st.peek()!='{'){return false;}
                else{st.pop();}
            }

            else if(ch == ']'){
                if(st.size() == 0 || st.peek() != '['){return false;}
                else{st.pop();}
            }
            else{}
        }

        if(st.size() == 0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String s1 = "(a+(b+c+d)-{e[f/g]+g}(a*c)+d)";
        String s2 = "[{()]]";
        System.out.println(balancedBrackets(s1));
        System.out.println(balancedBrackets(s2));
    }
}
