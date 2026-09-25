import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (! sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                flag=false;
                break;
            }
        }
        if(flag==true){
        System.out.print("true");
        }else{
        System.out.print("false");
        }
        sc.close();
    }
}