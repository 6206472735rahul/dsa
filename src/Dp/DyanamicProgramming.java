package Dp;

import java.util.Scanner;

public class DyanamicProgramming {
//
//    public  static int Fibbo(int n){//using recursion --> tc 0(2^n)
//        //base case
//        if(n==0 || n==1){
//            return n;
//        }
//     int ans1=   Fibbo(n-1);
//     int ans2=   Fibbo(n-2);
//     int res= ans1+ans2;
//     return res;
//
//    }


    //using recursion with Dynamic programming --> tc 0(n)//this is code of  memoization rules
//public  static int Fibbo(int n,int dp[]){
//        //base case
//        if(n==0 || n==1){
//            return n;
//        }
//        int ans1,ans2;
//        if(dp[n-1]==-1){
//            ans1=   Fibbo(n-1,dp);
//            dp[n-1]=ans1;
//        }
//        else{
//            ans1=dp[n-1];
//        }
//        if(dp[n-2]==-1){
//            ans2= Fibbo(n-2,dp);
//            dp[n-2]=ans2;
//        }
//        else{
//            ans2= dp[n-2];
//        }
//        int res= ans1+ans2;
//        return res;
//
//    }
//
    //using iterative dynamic programming (fibbonacci series)
    public static int fibbo(int n){
        //base case
        if(n==0 || n==1){
            return  n;
        }
    int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }


    //stairs case using recursion
//    public  static int stairs(int n){
//        //base case
//        if(n==0 || n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        //recursive call
//           int ans1 =stairs(n-1);
//           int ans2=stairs(n-2);
//            int ans3=stairs(n-3);
//            int myAns= ans1+ans2+ans3;
//            return myAns;
//    }

    ////using recursion with Dynamic programming --> tc 0(n)//this is a code of  memoization rules
    public  static int stairs(int n ,int dp[]){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        //recursive call
        int ans1;
        if(dp[n-1]==-1){
            ans1 =stairs(n-1,dp);
            dp[n-1]=ans1;
        }
        else{
            ans1=dp[n-1];
        }
        int ans2;
        if(dp[n-2]==-1){
            ans2=stairs(n-2,dp);
            dp[n-2]=ans2;
        }
        else{
            ans2=dp[n-2];
        }
        int ans3;
        if(dp[n-3]==-1){
            ans3=stairs(n-3,dp);
            dp[n-3]=ans3;
        }
        else{
            ans3=dp[n-3];
        }
        int myAns= ans1+ans2+ans3;
        return myAns;
    }

    //iterative dynamic programming
    public static long stairI(int n){
        long dp[]= new long[n+1];
        if(n==0 || n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }

//    //min steps to one using recursion
//    public static int minStep(int n){
//        //base case
//        if(n==1){
//            return 0;
//        }
//        int ans1;
//       ans1=minStep(n-1);
//        int ans2=Integer.MAX_VALUE;
//        if(n%2==0){
//             ans2=  minStep(n/2);
//        }
//        int ans3= Integer.MAX_VALUE;
//        if(n%3==0){
//            ans3=  minStep(n/3);
//        }
//        return Math.min(ans1,Math.min(ans2,ans3))+1;
//
//    }

//    //min steps to one using recursion  with dynamic programming apply memoization
//    public static int minStep(int n,int dp[]){
//        //base case
//        if(n==1){
//            return 0;
//        }
//        int ans1;
//        if(dp[n-1]==-1){
//            ans1=minStep(n-1,dp);
//            dp[n-1]=ans1;
//        }
//        else{
//            ans1= dp[n-1];
//        }
//           int  ans2=Integer.MAX_VALUE;
//            if(n%2==0){
//                if(dp[n/2]==-1){
//                    ans2=  minStep(n/2,dp);
//                    dp[n/2]=ans2;
//                }
//                else{
//                    ans2=dp[n/2];
//                }
//            }
//
//        int ans3= Integer.MAX_VALUE;
//        if(n%3==0){
//            if(dp[n/3]==-1){
//                ans3=  minStep(n/3,dp);
//                dp[n/3]=ans3;
//            }
//            else{
//                ans3=dp[n/3];
//            }
//        }
//        return Math.min(ans1,Math.min(ans2,ans3))+1;
//    }

    //min steps to one using recursion  with dynamic programming apply iterative method
    public static int minStep(int n){
        if(n==1){
            return 0;
        }
      int dp[]= new int[n+1];
      dp[1]=0;
      for(int i=2;i<dp.length;i++){
        int min= dp[i-1];
        if(i%2==0){
            if(min>dp[i/2]){
                min=dp[i/2];
            }
        }
        if(i%3==0){
            if(min>dp[i/3]){
                min=dp[i/3];
            }
        }
        dp[i]=1+min;
      }
return dp[n];

    }

    //min square represent N using recursion
//    public static int minSquare(int n){
//        //base case
//        if(n==0){
//            return 0;
//        }
//        int minAns=Integer.MAX_VALUE;
//        for(int i=1;i*i<=n;i++){
//        int currAns= minSquare(n-(i*i));
//          if(minAns>currAns) {
//              minAns = currAns;
//          }
//        }
//        return 1+minAns;
//    }

    //using dynamic programming apply memoization method
    public static int minSquare(int n ,int dp[]){
        //base case
        if(n==0){
            return 0;
        }
        int minAns=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int currAns;
            if(dp[n-(i*i)]==-1) {
            currAns= minSquare(n-(i*i),dp);
            dp[n-(i*i)]=currAns;
            }
            else{
                currAns=dp[n-(i*i)];
            }
            if(minAns>currAns) {
                minAns = currAns;
            }
        }
        return 1+minAns;
    }

    //using iterative method
    public static int minSuareI(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        //first loop will be go i iteration
        for(int i=1;i<=n;i++){
            int min= Integer.MAX_VALUE;
            //2nd loop work recursion problem
            for(int j=1;j*j<=i;j++){
                int currAns= dp[i-(j*j)];
                if(min>currAns){
                    min= currAns;
                }
            }
            dp[i]=1+min;
        }
        return dp[n];
    }

    //find minimum cost path using recursion with 2d arrays given (dp-->2)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        //initialize the arrays size
        int dp[]= new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
       // System.out.println(Fibbo(n,dp));
      //  System.out.println(Fibbo(n));
       // System.out.println(fibbo(n));
       // System.out.print(stairs(n,dp));
       // System.out.println(stairI(n));
       // System.out.println(minStep(n));
       // System.out.println(minSquare(n,dp));
      //  System.out.println(minSquare(n));
        System.out.println(minSuareI(n));


    }
}
