import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long n2 = n;
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        long[] array = new long[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = n2 % 10;
            n2 = n2 / 10;
        }

        Arrays.sort(array); 

        long answer = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            answer = answer * 10 + array[i];
        }

        return answer;
    }
}