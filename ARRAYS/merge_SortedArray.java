package ARRAYS;

import java.util.Arrays;

public class merge_SortedArray {

    public static void merge_Brute_Force(int nums1[], int nums2[], int m, int n){
        int j = 0;
        for(int i = m; i < m + n; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));
    }

    public static void merge_Optimal_Sol(int nums1[], int nums2[], int m, int n){
        
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while(nidx >= 0){
            if(midx >= 0 && nums1[midx] < nums2[nidx]){
                nums1[right] = nums2[nidx];
                nidx--;
            }else{
                nums1[right] = nums1[midx];
                midx--;
            }
            right--;
        }
        System.out.print(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m = 3;
        int n = 3;
        merge_Brute_Force(nums1, nums2, m, n);
        merge_Optimal_Sol(nums1, nums2, m, n);
    }
}
