import java.util.Scanner;
public class striverQuestion2 {
    public static void callName(int count, String name){
        if(count == 0){
            return;
        }
        System.out.println(name);
        count --;
        callName(count,name);
    }

    public static void print1toNLinearly(int i,int n){
        if(i>n) {
            return;
        }
        System.out.println(i);
        i++;
        print1toNLinearly(i,n);
    }

    public static void printNto1Linearly(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        printNto1Linearly(n);
    }

    public static void print1toNBacktrack(int i,int n){
        if(i < 1){
            return;
        }
        print1toNBacktrack(i-1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int count = sc.nextInt();
        System.out.println("Enter ur name");
        String name = sc.next();
        callName(count,name);
        int i=1;
        System.out.println();
        System.out.println("1 to n numbers are: ");
        print1toNLinearly(i,count);

        System.out.println();
        System.out.println("n to 1 numbers are: ");
        printNto1Linearly(count);


        i=count;
        System.out.println();
        System.out.println("1 to n numbers are by Backtracking are: ");
        print1toNBacktrack(i,count);

    }
}
