import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,6,1};
        bubble(arr);
        System.out.println("The sorted array is: "+ Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run the steps n-1 step
        for(int i=0;i<arr.length;i++){
            //for each step max  item will come at the last index respectively
            for(int j=1;j<arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }



}