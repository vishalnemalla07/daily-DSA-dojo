package ARRAYS;

import java.util.Arrays;

public class squares_sortedArray {

    public static int[] Brute_Sol(int nums[]){
        int n = nums.length;
        int square[] = new int[n];

         for(int i = 0; i < n; i++){
            square[i] = nums[i] * nums[i];
         }
         Arrays.sort(square);
         return square;
    }

    public static int[] Two_Pointers(int nums[]){
        int n = nums.length;
        int left = 0; 
        int right = n - 1;
        int square[] = new int[n];

        for(int i = n - 1; i >= 0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                square[i] = nums[left] * nums[left];
                left++;
            }else{
                square[i] = nums[right] * nums[right];
                right--;
            }
        }
        return square;
    }
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        System.out.print(Arrays.toString(Brute_Sol(arr)));
        System.out.print(Arrays.toString(Two_Pointers(arr)));
    }
}
