public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
        System.out.println(Sumfactorial(num));

    }
    public static int factorial(int num){
        if(num <= 1){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static int Sumfactorial(int num){
        if(num <= 1){
            return 1;
        }
        return num + Sumfactorial(num-1);
    }
}
