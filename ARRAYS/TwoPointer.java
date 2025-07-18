package ARRAYS;
import java.util.*;
class TwoPointer {
    
    public static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0 ||union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                    i++;
                }
                else{
                if(union.size() == 0 ||union.get(union.size() - 1) != arr2[j]){
                    union.add(arr1[j]);
                    j++;
                    }
                }
            }
        }
        while(j < n2){
            if(union.size() == 0 ||union.get(union.size() - 1) != arr2[j]){
                union.add(arr1[j]);
            }
                j++;
        }
        while(i < n1){
            if(union.size() == 0 ||union.get(union.size() - 1) != arr1[i]){
                union.add(arr1[i]);
            }
                i++;
        }
        Collections.sort(union);
        return union;
    }    

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};
        ArrayList<Integer> union = FindUnion(arr1, arr2);
        for(int val : union){
            System.out.print(val + " ");
        }
        
    }
}