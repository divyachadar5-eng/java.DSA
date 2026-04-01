
import java.util.ArrayList;

class MergeSorttempArrayList{
    static void mergeSort(int[] arr,int l,int r) {
       ArrayList<Integer>temp=new ArrayList<>();
        int i=l;
        int j = mid + 1;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            
            else{
                temp.add(arr[i]);
                j++;
            }
        }while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(i<=r){
            temp.add(arr[j]);
            j++;
        }
        for(int k=0;k<=temp.size();k++){
            arr[l+k]=temp.get(k);
        }
 
        if(l>= r) return;

        int mid = (l + r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        mergeSort(arr,mid,r);
    }
        public static void main(String[] args){
            int arr[]={ 4,5,3,6,7};

        }
    }
