public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 37, 25, 36, 66, 58, 24, 99, 34, -2, 22, 79, 100};
        int target = 22;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
        //Linear search gives the index if item is found
        //if not found, it returns -1
    }

        static int linearSearch(int[] arr,int target){
            if(arr.length == 0){
                return -1;
            }
            //run for loop to check element target
            for(int index=0;index<arr.length;index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
            return -1;
        }

}