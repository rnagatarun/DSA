import java.util.Arrays;

public class missingNumber_268 {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        missingNumber(arr);
        //System.out.println(Arrays.toString(arr));

    }

    static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] <arr.length && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //search for first missing number
        for(int index=0;index<arr.length;i++){
            if(arr[index]!=index){
                return index;
            }

        }

        //case2
        return arr.length;

    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
