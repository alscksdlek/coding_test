class Solution {
    public boolean solution(int x) {
        int n = x;
        int sum = 0;
        while(x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        
        if(n % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}