public class longestSwitchingContigiousSubArray {

    public static int oddEvenContigiousSubarray(int[] a){
        int n = a.length;
        if(n<=2){
            return n;
        }
        int maxLen = 0;
        int even = a[0];
        int odd = a[1];
        int start = 0;
        for(int i=2;i<n;i++){
            if(i%2 == 0 && a[i]!=even){
                maxLen = Math.max(maxLen,i - start);
            }
            start = i-1;
            even = a[i];
            odd = a[i-1];

        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,2,3,5,2,5,3,2};
        int[] arr2 = {5,5,5,5,5,5,5,5};
    }
}
