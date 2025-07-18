package ARRAYS;
import java.util.*;
//BRUTE FORCE --> TC = O(Nlog(N))
public class largestElement {

    public static void largest(int num[]){
        Arrays.sort(num);
        System.out.println(num[num.length - 1]);
    }

    //OPTIMAL APPROACH --> TC = O(N)
    public static void largestOPT(int num[]){
        int max = num[0];

        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
    public static void main(String[] args) {
        int num[] = {8,10,5,7,9};
        // largest(num);
        largestOPT(num);
    }
}
