import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        while (true) {
            int i = n % 10;
            n = n / 10;
            sum += i;
            if (n == 0) break;
        }
        return sum;
    }
}