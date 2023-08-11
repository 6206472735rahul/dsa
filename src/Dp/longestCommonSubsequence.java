package Dp;

public class longestCommonSubsequence {

//    public static int lcs(String str1,String str2,int i,int j){
//        //base case
//        if(str1.length()==i || str2.length()==j){
//            return 0;
//        }
//        int myAns;
//        if(str1.charAt(i)==str2.charAt(j)){
//         int smallAns =lcs(str1,str2,i+1,j+1);
//         myAns= 1+smallAns;
//        }
//        else{
//            int ans1= lcs(str1,str2,i+1,j);
//            int ans2= lcs(str1,str2,i,j+1);
//            myAns= Math.max(ans1,ans2);
//        }
//        return myAns;
//    }

    //using dynamic  programming and apply memoization
public static int lcs(String str1,String str2,int i,int j,int dp[][]){
    //base case
    if(str1.length()==i || str2.length()==j){
        return 0;
    }
    int myAns;
    if(str1.charAt(i)==str2.charAt(j)){
                 int smallAns;
                  if(dp[i+1][j+1]==-1){
                      smallAns=lcs(str1,str2,i+1,j+1,dp);
                      dp[i+1][j+1]=1+smallAns;
                  }
                  else{
                      smallAns=dp[i+1][j+1];
                  }
                  myAns=1+smallAns;
                }
    else{
        int ans1;
        if(dp[i+1][j]==-1){
            ans1= lcs(str1,str2,i+1,j,dp);
            dp[i+1][j]=ans1;
        }
        else{
            ans1=dp[i+1][j];
        }
        int ans2;
        if(dp[i][j+1]==-1){
            ans2= lcs(str1,str2,i,j+1,dp);
            dp[i][j+1]=ans2;
        }
        else{
            ans2=dp[i][j+1];
        }
        myAns= Math.max(ans1,ans2);
    }
    return myAns;
}

//using iterative method (bottom to top approach
    public static int lcsI(String str1,String str2){
    int m= str1.length();
    int n= str2.length();
    int dp[][]= new int[m+1][n+1];
    for(int i=m-1;i>=0;i--){
        int myAns;
        for(int j=n-1;j>=0;j--){
            if(str1.charAt(i)==str2.charAt(j)){
                myAns= 1+dp[i+1][j+1];
            }
            else{
                int ans1= dp[i+1][j];
                int ans2= dp[i][j+1];
                myAns= Math.max(ans1,ans2);
            }
            dp[i][j]=myAns;
        }
    }
    return dp[0][0];
    }
    //edit distance using recursion
//    public static int editDistance(String s,String t){
//    //base case
//        if(s.length()==0){
//            return t.length();
//        }
//        if(t.length()==0){
//            return s.length();
//        }
//        int smallAns;
//        if(s.charAt(0)==t.charAt(0)){
//         smallAns= editDistance(s.substring(1),t.substring(1));
//        }
//        else{
//            //replace
//            int ans1= 1+editDistance(s.substring(1),t.substring(1));
//            //delete
//            int ans2= 1+editDistance(s.substring(1),t);
//            //insert
//            int ans3= 1+editDistance(s,t.substring(1));
//            smallAns= Math.min(ans1,Math.min(ans2,ans3));
//        }
//        return smallAns;
//    }

    //edit distance using dynamic programming apply memoization

    public static int editDistance(String s,String t,int dp[][]){
        //base case
        if(s.length()==0){
            return t.length();
        }
        if(t.length()==0){
            return s.length();
        }
        int m= s.length();
        int n=t.length();
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int smallAns;
        if(s.charAt(0)==t.charAt(0)){
            if(dp[m-1][n-1]==-1){
                smallAns= editDistance(s.substring(1),t.substring(1),dp);
                dp[m-1][n-1]=0+smallAns;
            }
            else{
                smallAns=dp[m-1][n-1];
            }
        }
        else{
            //replace
            int ans1;
            if(dp[m-1][n-1]==-1){
                ans1= 1+editDistance(s.substring(1),t.substring(1),dp);
                dp[m-1][n-1]=ans1;
            }
            else{
                ans1=dp[m-1][n-1];
            }
            //delete
            int ans2;
            if(dp[m-1][n]==-1){
                ans2= 1+editDistance(s.substring(1),t,dp);
                dp[m-1][n]=ans2;
            }
            else{
                ans2=dp[m-1][n];
            }
            //insert
            int ans3;
            if(dp[m][n-1]==-1){
                ans3= 1+editDistance(s,t.substring(1),dp);
                dp[m][n-1]=ans3;
            }
            else{
                ans3=dp[m][n-1];
            }
            smallAns= Math.min(ans1,Math.min(ans2,ans3));
        }
        return smallAns;
    }

    //using iterative method
    public static int editDistanceI(String s,String t){
    int dp[][]=new int[s.length()+1][t.length()+1];
    for(int i=0;i<dp.length;i++){
        for(int j=0;j<dp[0].length;j++){
            if(i==0){
                dp[i][j]=j;
            }
            else if(j==0){
                dp[i][j]=i;
            }
            else if(s.charAt(i-1)==t.charAt(j-1)){ //consider last char
                dp[i][j]= dp[i-1][j-1];
            }
            else{
                //replace
                int ans1=1+ dp[i-1][j-1];
                //delete
                int ans2=1+dp[i-1][j];
                // insert
                int ans3=1+dp[i][j-1];

                dp[i][j]=Math.min(ans1,Math.min(ans2,ans3));
            }

        }
    }
    return dp[dp.length-1][dp[0].length-1];

    }
    //knapSack using recursion
    public static int knapsack(int W,int val[],int wt[],int i){
    //base case
        if(i==val.length){
            return 0;
        }
        int ans;
        if(wt[i]<=W){
//including ith item
    int ans1=  val[i]+knapsack(W-wt[i],val,wt,i+1);
     //excluding ith item
            int ans2= knapsack(W,val,wt,i+1);
           ans= Math.max(ans1,ans2);
        }
        else{
            ans= knapsack(W,val,wt,i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1= "abc";
        String str2= "dc";
      //  System.out.println(lcs(str1,str2,0,0));
        int dp[][]= new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
               dp[i][j]=-1;
            }
        }
       // System.out.println(editDistance(str1,str2,dp));
        System.out.println(editDistanceI(str1,str2));
        //System.out.println(lcs(str1,str2,0,0,dp));
        //System.out.println(lcsI(str1,str2));
//        String s= "whgtdwhgtdg";
//       String t= "aswcfg";
//        System.out.println(editDistance(s,t));
        int val[]={200,300,100};
        int wt[]={20,25,30};
        int W=50;
        for(int i=0;i<val.length;i++){
            int ans= knapsack(W,val,wt,0);
            System.out.println(ans);
        }

    }
}
