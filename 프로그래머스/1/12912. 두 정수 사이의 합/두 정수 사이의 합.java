class Solution {
    public long solution(int a, int b) {
        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        
        long sum = 0;
        if (a == b) {
            sum = a;
        } else {
            for(int i = a; i <= b; i++){
                sum += i;
            }
        }
        
        return sum;
    }
}