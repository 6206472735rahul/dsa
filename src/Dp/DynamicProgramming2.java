package Dp;

public class DynamicProgramming2 {

//    //find the minimum cost of path using recursion
//    public static int minCost(int cost[][],int i,int j){
//        int m=  cost.length;
//        int n= cost[0].length;
//        //special case
//        if(i==m-1 && j==n-1){
//            return cost[i][j];
//        }
//        //base case
//        if(i>=m || j>=n){
//            return Integer.MAX_VALUE;
//        }
//        //down
//        int ans1= minCost(cost,i+1,j);
//        //right
//        int ans2= minCost(cost,i,j+1);
//        //diagonal
//        int ans3= minCost(cost,i+1,j+1);
//        return cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
//
//    }

    //find the minimum cost of path using dynamic programming with recursion apply memoization
    public static int minCost(int cost[][],int i,int j,int  dp[][]){
        int m=  cost.length;
        int n= cost[0].length;
        //special case
        if(i==m-1 && j==n-1){
            return cost[i][j];
        }
        //base case
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        int ans1,ans2,ans3;
        //down
        if(dp[i+1][j]==Integer.MAX_VALUE){
            ans1= minCost(cost,i+1,j,dp);
            dp[i+1][j]=ans1;
        }
        else{
            ans1=dp[i+1][j];
        }
        //right
        if(dp[i][j+1]==Integer.MAX_VALUE){
            ans2= minCost(cost,i,j+1,dp);
            dp[i][j+1]=ans2;
        }
        else{
            ans2=dp[i][j+1];
        }
        //diagonal
        if(dp[i+1][j+1]==Integer.MAX_VALUE){
            ans3= minCost(cost,i+1,j+1,dp);
            dp[i+1][j+1]=ans3;
        }
        else{
            ans3=dp[i+1][j+1];
        }
        return cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));

    }

    //iterative method
    public static int minCostI(int cost[][]){
        int m= cost.length;
        int n= cost[0].length;
        int dp[][]= new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[i][j]=cost[i][j];
                    continue;
                }
                int ans1= dp[i+1][j]; //down
                int ans2= dp[i][j+1];//right
                int ans3= dp[i+1][j+1];//diagonal
                dp[i][j]=cost[i][j]+Math.min(ans1,Math.min(ans2,ans3));
            }
        }
      return   dp[0][0];
    }

    public static void main(String[] args) {
        int cost[][]={{3,4,1,2},{2,1,8,9},{4,7,8,1}};
      //  System.out.print(minCost(cost,0,0));
        int dp[][]=new int[cost.length+1][cost[0].length+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j< dp[0].length;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
       // System.out.println(minCost(cost,0,0,dp));
        System.out.println(minCostI(cost));

    }
}
