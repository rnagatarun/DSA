public class sumOfDigits {
    public static void main(String[] args) {
        int num = sum(1042);
        int num1 = prod(345);
        System.out.println(num);
        System.out.println(num1);


    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

    static int prod(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * prod(n/10);
    }

}
