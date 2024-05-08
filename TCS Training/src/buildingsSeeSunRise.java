public class buildingsSeeSunRise {
    public static int checkSunRise(int[] a){
        int count = 1;
        int maxTillNow = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] > maxTillNow){
                count++;
                maxTillNow = a[i];
            }

        }
        return count;
    }


    public static void main(String[] args) {
        int [] arr1 = {6,8,14,13,15};
        int [] arr2 = {6,15,14,19,17};
        System.out.println(checkSunRise(arr1));
        System.out.println(checkSunRise(arr2));
    }
}
