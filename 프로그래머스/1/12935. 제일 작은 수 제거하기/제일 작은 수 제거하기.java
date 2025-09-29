class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        for(int n : arr){
            if(n < min){
                min = n;
            }
        }
        int[] newArr = new int[arr.length - 1];
        int count = 0;
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        for(int n : arr){
            if(n != min){
                newArr[count++] = n;
            }
        }
        return newArr;
    }
}