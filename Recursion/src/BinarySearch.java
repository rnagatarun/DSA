public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,77,89,91,99,102,119};
        int target = 102;
        int start = arr[0];
        int end = arr.length-1;
        System.out.println(Search(arr,target,start,end));
    }
    public static int Search(int[] arr,int target,int start,int end){
        int mid = start + (end-start)/2;
        if(arr[mid] == target){
            return target;
        }
        if(arr[mid] < target){
            return Search(arr,target, start = mid + 1 ,end);
        }
        if(start > end){
            return -1;
        }
        return Search(arr, target, start, end = mid-1);

    }
}
