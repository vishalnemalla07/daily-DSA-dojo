package ARRAYS;
import java.util.Arrays;

public class move_zeros {

    //OPTIMAL SOLUTION --> TC = O(N)
    public static int[] OPT(int arr[]){
        int n = arr.length;
        int i = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12}; 
        OPT(nums);
        System.out.print(Arrays.toString(nums));
        
    }
}
