import java.util.Scanner;

public class Flag{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=6;
        boolean Flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==d){
                    Flag=true;
                    System.out.println("Found");
                    break;

                }
                if(!Flag){
                    System.out.println("Not found");
                }
            }
        }
    }
}
