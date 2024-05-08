public class MaxWealth {

    public static void main(String[] args) {

        int [][] accounts = {
                {23,4},
                {18,12}
        };

       

    }

    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for(int person =0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum += accounts[person][account];
            }

            //we have sum of accounts of person
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

}
