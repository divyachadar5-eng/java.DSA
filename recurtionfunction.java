//     static int fibonacci(int n){
//         if(n<=1)return n;
//         return fibonacci(n-1)+fibonacci(n-2);
//     }
    
//     public static void main(String[] args ){
//         for(int i=0;i<6;i++){
//             System.out.println(fibonacci(i));
//         }
//     }
// }




public class recurtionfunction{
    static void subset(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
return;
        }
        char ch=up.charAt(0);
        
        //include
        subset(p+ch,up.substring(1));
        //exclude
        subset(p,up.substring(1));
    }
    public static void main(String[] args) {
        String str="abc";
        subset("",str);
    }
}