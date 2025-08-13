/*Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 

Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer */

package ARRAYS;

public class maximum_Product_Subarray {
    
    public static int maxProduct_Subarray(int nums[]){
        int n =  nums.length;
        int max_Ending_Here = nums[0];
        int min_Ending_Here = nums[0];
        int maxSoFar = nums[0];

        for(int i = 1; i < n; i++){

            //If current number is negative swap max and min
            if(nums[i] < 0){
                int swap = max_Ending_Here;
                max_Ending_Here = min_Ending_Here;
                min_Ending_Here = swap;
            }
        max_Ending_Here = Math.max(nums[i], max_Ending_Here * nums[i]);
        min_Ending_Here = Math.min(nums[i], min_Ending_Here * nums[i]);
        maxSoFar = Math.max(maxSoFar, max_Ending_Here);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 3, -4};
        System.out.println("Maximum Product : " + maxProduct_Subarray(arr));
    }
}

/*Handles negatives: swapping maxEndingHere and minEndingHere ensures that a large negative can become a large positive later.

Handles zeros: when nums[i] is 0, both max and min reset naturally to 0 or the current number.

O(n) time, O(1) space. */