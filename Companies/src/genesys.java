public class genesys {


    public static int bank(int n , int x , int y , int[] arr){

        int res = 0;
        if(arr[0] > y ){
            return 0;
        }
        res = 1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i-1] + y >= arr[i]  && arr[i-1] < arr[i]){
                res++;
            }
            else if(arr[i-1] - x <= arr[i] && arr[i-1] > arr[i] ){
                res++;
            }
            else{
                return (res*2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        int x = 3;
        int y = 5;
        int[] arr = {1,6,5,4,1};
        int res = bank(n,x,y,arr);
        System.out.println(res);
    }
}