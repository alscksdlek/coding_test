import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int n : arr) {
            if(n % divisor == 0){
                count ++;
            }
        }
        
        if(count == 0){
            return new int[]{-1};
        }
        
        int[] newArray = new int[count];
        int newCount = 0;
        
        for (int n : arr) {
            if (n % divisor == 0) {
                newArray[newCount++] = n;
            }
        }
        
        Arrays.sort(newArray);
        return newArray;
    }
}