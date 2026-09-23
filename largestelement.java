import java.util.Scanner;

public class largestelement{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
    if(arr[i]>max)
        max=arr[i];

    }
    int max2=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max2 && arr[i]!=max)
            max2=arr[i];
    }
    System.out.print(max2);
}
}

