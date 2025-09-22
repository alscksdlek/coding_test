class Solution {
    public long[] solution(long n) {
        int count = 0;
        long n2 = n;
        
        while(n != 0){
            long t = n % 10;
            n = n / 10;
            count ++;
        }
        
        long[] array = new long[count];
        for(int i = 0; i < array.length; i++) {
            long t = n2 % 10;
            n2 = n2 / 10;
            array[i] = t;
        }
        
        return array;
    }
}