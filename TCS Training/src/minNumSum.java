import java.util.Arrays;

public class minNumSum {

    public static void minSum(int[] arr){
        Arrays.sort(arr);
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 == 0){
                num1 = num1*10 + arr[i];
            }
            else{
                num2 = num2*10 + arr[i];
            }
        }
        System.out.println("The sum is : " + (num1 + num2));
    }

    public static void main(String[] args) {
        int[] arr = {5,3,0,7,4};
        minSum(arr);
    }
}
