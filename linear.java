import java.util.Scanner;
public class linear{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            
        }
        int target=sc.nextInt();
        int ans=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                ans=i;
                break;
            }
        }
        System.out.print(ans);
    }
}
