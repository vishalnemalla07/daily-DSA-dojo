package ARRAYS;

import java.util.Arrays;

public class right_rotateArray{

    // public static void reverseBS(int nums[], int k){
    //     int n = nums.length;
    //     int temp[] = new int[n];

    //     for(int i = 0; i < n; i++){
    //         temp[(i + k) % n] = nums[i];
    //     }

    //     for(int j = 0; j < n; j++){
    //         nums[j] = temp[j];
    //     }

    //     System.out.print(Arrays.toString(nums));
    // }

    public static void reverseOPT(int nums[], int k){
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        
        System.out.print(Arrays.toString(nums));
    }

    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        // reverseBS(arr, k);
        reverseOPT(arr, k);
    }
}
