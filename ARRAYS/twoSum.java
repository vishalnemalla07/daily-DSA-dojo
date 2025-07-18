package ARRAYS;
import java.util.*;
public class twoSum{

    public static int[] two_Sum(int arr[], int target){
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
           int moreneeded = target - arr[i];
           if(mpp.containsKey(moreneeded)){
            ans[0] = mpp.get(moreneeded);
            ans[1] = i;
            return ans;
           }
           mpp.put(arr[i], i);
    }
    return ans;
}
    
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(two_Sum(arr, target)));
    }
}