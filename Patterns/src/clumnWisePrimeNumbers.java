public class clumnWisePrimeNumbers {
    public static void main(String[] args) {
        int rows = 5;  // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            int prime = 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(prime + " ");
                prime = getNextPrime(prime);
            }
            System.out.println();
        }
    }

    private static int getNextPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
