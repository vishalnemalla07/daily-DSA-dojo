package ARRAYS;

import java.util.*;

//----BRUTE FORCE---->TC: O(n^3 * log(no. of unique triplets))----->SC: (2 * no. of unique triplets)
public class Threesum {

    public static List<List<Integer>> brute_Force(int nums[], int n){
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    //--------Better Appraoch --->TC: O(n^2 * logM)--->SC: O(N) + (2 * log(no. of unique triplets))
    public static List<List<Integer>> better_Approach(int nums[], int n){
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0; i < n; i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int third = -(nums[i] + nums[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    
    //------Optimal Solution---> TC: O(nlogn + O(N^2))---->SC: O(n0. of unique triplets)
    public static List<List<Integer>> optimal_Sol(int nums[], int n){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(temp);
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return result;
    }

    
    public static void main(String[] args){
        int arr[] = {-1, 0, 1, 2, -1, 4};
        int n = arr.length;
        List<List<Integer>> result = optimal_Sol(arr, n);
        System.out.println("Unique Triplets : ");
        for(List<Integer> triplet : result){
            System.out.print(triplet);
        }
    }
}
