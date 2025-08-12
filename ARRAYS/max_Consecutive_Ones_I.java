/*Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1. */

package ARRAYS;

public class max_Consecutive_Ones_I {

    public static int maximumOnes(int nums[]){
        int n = nums.length;
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                count = 0;
            else
                count++;
        maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 1, 1, 1};
        System.out.println("The maximum ones count is : "+ maximumOnes(arr));
    }
}
