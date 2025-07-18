package ARRAYS;

public class subarray {

    public static void printSubarray(int[] nums){
        int total_subarrays = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                System.out.println();
                System.out.println("Sum: " + sum);
                total_subarrays++;
            }
            System.out.println();
        }
        System.out.println(total_subarrays);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        printSubarray(nums);
    }
}
