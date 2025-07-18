package ARRAYS;
import java.util.*;

public class secondlargest {

    //BRUTE FORCE --> TC = O(NLogN)
    public static void secondlargestBF(int nums[]){
        int n = nums.length;
        Arrays.sort(nums);

        System.out.println("Second smallest element : " + nums[1]);
        System.out.println("Second largest element : " + nums[n - 2]);
    }

    //BETTER SOLUTION --> TC = O(N) --> 2 LINEAR TRAVERSALS IN THE ARRAY.
    public static void secondlargestBS(int nums[]){
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_Small = Integer.MAX_VALUE;
        int second_Large = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            small = Math.min(small, nums[i]);
            large = Math.max(large, nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < second_Small && nums[i] != small){
                second_Small = nums[i];
            }
            if(nums[i] > second_Large && nums[i] != large){
                second_Large = nums[i];
            }
        }
        System.out.println("Second smallest element : " + second_Small);
        System.out.println("Second largest element : " + second_Large);

    }

    public static int secondSmallestOPT(int nums[]){
        int small = Integer.MAX_VALUE;
        int second_Small = Integer.MAX_VALUE;
       
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < small){
                second_Small = small;
                small = nums[i];
            }
            else if(nums[i] < second_Small && nums[i] != small){
                second_Small = nums[i];
            }
        }
        return second_Small;
    }

    public static int secondlargestOPT(int nums[]){
        int large = Integer.MIN_VALUE;
        int second_Large = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > large){
                second_Large = large;
                large = nums[i];
            }
            else if(nums[i] > second_Large && nums[i] != large){
                second_Large = nums[i];
            }
        }
        return second_Large;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,4,6,7,5};
        // secondlargestBF(nums);
        // secondlargestBS(nums);
        int second_Small = secondSmallestOPT(nums);
        int second_Large = secondlargestOPT(nums);
        System.out.println("Second smallest element in the array : " + second_Small);
        System.out.println("Second largest element in the array : " + second_Large);
    }
}
