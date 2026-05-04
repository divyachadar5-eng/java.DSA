import java.util.Arrays;
// public class recurtionfunction3 {
//     static int minSteps(String s,int i,int[] dp) {
//         if(i==s.length() )return 1;
//         if(s=="0") return 0;
//         if(dp[i] !=-1) return dp[i];
//         int one =minSteps(s,i+1,dp);
//         int two=0;
//         if(i+1<s.length());
//         {
//             int num=s.charAt(i)-'0'+(s.charAt(i+1)-'0');
//             if(num<=26)
//             {
//                 two=minSteps(s,i+2,dp);
//             }
//         }
//             return dp[i]=one+two;
//     }
// public static void main(String[] args){
//     String s="12";
//     int[] dp=new int[s.length()];
//     Arrays.fill(dp,-1);
//     int i=0;
//     System.out.println(minSteps(s,i,dp));
// }
// }


// public class recurtionfunction3{
//     static int minSteps(int n,int[] dp) {
//         if(n<=2) return n;
//         if(dp[n] !=-1) return dp[n];
//         dp[n] = minSteps( n-1, dp) + (n-1) * minSteps(n-2, dp);
//         return dp[n];
//     }
//     public static void main(String[] args) {
//         int n=3;
//         int[] dp=new int[n+1];
//         Arrays.fill(dp,-1);
//         System.out.println(minSteps(n,dp));
//     }
// }


public class recurtionfunction3{
    static int[][] dp=new int [100][100];
    static int minSteps(int[] arr,int i,int k){
        if(k==0) return 0;
        if(i==arr.length) return 0;
        if (dp[i][k] !=-1) return dp[i][k]; 
        int x=0;
        if(arr[i] <= k)
        {
            x=minSteps(arr,i+1,k-arr[i]);
        }
        int y=minSteps(arr, i+1, k);
        dp[i][k]=x+y;
        return dp[i][k];
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        int i=0;
        int k=3;
        System.out.println(arr,i,k);
    }
}