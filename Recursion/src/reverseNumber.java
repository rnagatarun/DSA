public class reverseNumber {
    public static void main(String[] args) {
        int ans = 5498;
        System.out.println(rev(ans));
    }
    static int rev(int n) {
        if (n == 0) {
            return n;
        }
        if (n > 0) {
            int reverse = 0;
            int temp= (n % 10);
            reverse = reverse*10 + temp;
            rev(n / 10);

            //return n;
        }
        return n;
    }
}
