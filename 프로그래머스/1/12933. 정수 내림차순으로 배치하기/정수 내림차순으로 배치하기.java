class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        for(int i = 0; i <str.length;i++){
            for(int j = i + 1; j <str.length;j++){
                if(Integer.parseInt(str[i]) < Integer.parseInt(str[j])){
                    String t = str[i];
                    str[i] = str[j];
                    str[j] = t;
                }
            }
        }
        String str2 = String.join("", str);
        n = Long.parseLong(str2);
        return n;
    }
}