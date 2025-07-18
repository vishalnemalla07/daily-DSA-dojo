package ARRAYS;

public class remove_element {

    public static void OPT(int arr[], int target){
        int n = arr.length;
        int i = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != target){
                arr[i] = arr[j];
                i++;
            }
        }
        System.out.println("K is : " + i);
    }
 public static void main(String[] args) {
    int nums[] = {3,2,2,3};
    int val = 3;
    OPT(nums, val);
 }   
}
