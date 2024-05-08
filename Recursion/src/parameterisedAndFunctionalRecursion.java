import java.util.Scanner;
public class parameterisedAndFunctionalRecursion {

    //parameterised
    public static void sumOfNNumbers(int n,int sum){
        if(n == 0){
            System.out.println(sum);
            return ;
        }
        sumOfNNumbers(n-1,sum+n);
    }

    public static int returnSum(int m){
        if(m == 0){
            return 0;
        }
        return m + returnSum(m-1);
    }


    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a number to get the sum  till that number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfNNumbers(n,sum);

        System.out.println("This is from parametersised return statement");
        System.out.println("Enter a number to get the sum  till that number: ");
        int m = sc.nextInt();
        System.out.println(returnSum(m));

    }
}
