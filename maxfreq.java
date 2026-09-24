import java.util.*;
public class maxfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int max=0;
        
        for(int j=0;j<n;j++)
            {
            count=0;
        for (int i = j; i <arr.length; i++)
            {
            if(arr[j]==arr[i]){
            count++;
            }
            if(count>max){
                max= count;
            }
        // Print final result
        System.out.println(max);
        
        sc.close();
    }
}
    }
}


//7
//2 1 3 2 3 9 3